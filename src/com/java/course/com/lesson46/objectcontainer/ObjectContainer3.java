package com.java.course.com.lesson46.objectcontainer;

public class ObjectContainer3<T> {

    private Node<T> head;

    private int size = 0;

    public void addItem(T value) {
        Node<T> newElement = new Node<>(value);
        if (head == null) {
            head =  newElement;
        } else {
            Node<T> currentElement = head;
            while (currentElement.next != null) {
                currentElement = currentElement.next;
            }
            currentElement.next = newElement;
        }
        size++;
    }


    private static class Node<E> {
        E item;
        Node<E> next;

        Node(E element) {
            this.item = element;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    ", next=" + next +
                    '}';
        }
    }
}
