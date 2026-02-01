package com.java.course.com.lesson46.objectcontainer;

public class ObjectContainer6<T> {

    private Node<T> head;
    private int size = 0;

    public void addItem(T element) {
        Node<T> newElement = new Node<>(element);
        if (head == null) {
            head = newElement;
        } else {
            Node<T> currentElemet = head;
            while (currentElemet.next != null) {
                currentElemet = currentElemet.next;
            }
            currentElemet.next = newElement;
        }
        size++;
    }

    private class Node<E> {
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
