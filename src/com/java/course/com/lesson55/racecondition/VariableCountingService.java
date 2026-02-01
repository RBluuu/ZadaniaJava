package com.java.course.com.lesson55.racecondition;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class VariableCountingService {
    private static final List<String> TYPES = List.of(
            "String", "int", "boolean", "byte", "short", "long", "float", "double", "char"
    );

    public Map<String, Map<String, Integer>> countVariablesInFiles(List<Path> filePaths, int countThread) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(countThread);
        Map<String, Future<Map<String, Integer>>> map = new HashMap<>();

        for (Path path : filePaths) {
            Future<Map<String, Integer>> future = executor.submit(() -> countVariablesInFile(path));
            map.put(path.toString(), future);
        }

        Map<String, Map<String, Integer>> result = new HashMap<>();

        for (Map.Entry<String, Future<Map<String, Integer>>> entry : map.entrySet()) {
            try {
                result.put(entry.getKey(), entry.getValue().get());
            } catch (ExecutionException e) {
                System.err.println("Błąd w pliku " + entry.getKey() + ": " + e.getMessage());
                result.put(entry.getKey(), new HashMap<>());
            }
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
        return result;
    }

    private Map<String, Integer> countVariablesInFile(Path filePath) throws IOException {
        Map<String, Integer> typeCount = new HashMap<>();
        for (String type : TYPES) {
            typeCount.put(type, 0);
        }

        List<String> lines = Files.readAllLines(filePath);
        for (String line : lines) {
            for (String type : TYPES) {
                if (line.contains(type + " ")) {
                    int count = countOccurrences(line, type + " ");
                    typeCount.put(type, typeCount.get(type) + count);
                }
            }
        }

        return typeCount;
    }

    private int countOccurrences(String line, String token) {
        int count = 0;
        int index = 0;
        while ((index = line.indexOf(token, index)) != -1) {
            count++;
            index += token.length();
        }
        return count;
    }
}
