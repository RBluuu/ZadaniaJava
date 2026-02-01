package com.java.course.com.lesson46.minmax;

public class MinMax<T extends Comparable<T>> {
    //Stworz klase MinMax<T extends Comparable> ktora jako pola klasy pobiera instancje T max oraz T min
    //Nastepnie stworz klase MinMaxService ktora bedzie miala statyczna metode MinMax<cos tutaj> getMinAndMax(List<cos tutaj> elements) zadaniem tej metody jest
    // zwracanie mina i maxa z listy w tym jednym obiekcie wg naturalnego porządku jaki gwarantuje komparator, klasa MinMax powinna byc generyczna i metody getMin oraz
    // getMax powinny zwraca instancje tego co bedzie na liscie elements, czyli jak przekazemy liste stringow to getMax ma zwraca String, getMin tez stringa a jak damy
    // liste osob to ma getMax zwraca osobe, itp itd.

    private T min;
    private T max;
    public MinMax(T min, T max) {
        this.min = min;
        this.max = max;
    }

    public T getMin() {
        return min;
    }

    public void setMin(T min) {
        this.min = min;
    }

    public T getMax() {
        return max;
    }

    public void setMax(T max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "MinMax{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }
}
