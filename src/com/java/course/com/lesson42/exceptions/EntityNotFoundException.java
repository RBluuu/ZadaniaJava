package com.java.course.com.lesson42.exceptions;

import java.time.Instant;
import java.util.Map;

public class EntityNotFoundException extends RuntimeException{
    private final String entityName;
    private final Map<String,Object> values;
    private final Instant occuredAt;

    public EntityNotFoundException(String entityName, Map<String, Object> values, Instant occuredAt) {
        this.entityName = entityName;
        this.values = values;
        this.occuredAt = occuredAt;
    }

    public EntityNotFoundException(String message, String entityName, Map<String, Object> values, Instant occuredAt) {
        super(message);
        this.entityName = entityName;
        this.values = values;
        this.occuredAt = occuredAt;
    }

    @Override
    public String toString() {
        return "EntityNotFoundException{" +
                "entityName='" + entityName + '\'' +
                ", values=" + values +
                ", occuredAt=" + occuredAt +
                '}';
    }
}
