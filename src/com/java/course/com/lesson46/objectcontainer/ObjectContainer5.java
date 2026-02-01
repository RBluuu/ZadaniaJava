package com.java.course.com.lesson46.objectcontainer;

public class ObjectContainer5<T> {

    private Node<T> head;
    private int size = 0;

    public void addItem(T value) {
        Node<T> newElement = new Node<>(value);
        if (head == null) {
            head = newElement;
        } else {
            Node<T> currentElement = head;
            while (currentElement.next != null) {
                currentElement = currentElement.next;
            }
            currentElement.next = newElement;
        }
        size++;;
    }

    public void removeItem(T value) {
        if (head == null) {
            return;
        }
        if (head.item.equals(value)) {
            head = head.next;
            size--;
            return;
        }
            Node<T> currentElement = head;
            while (currentElement.next != head) {
                currentElement = currentElement.next.next;
            }
            currentElement.next = currentElement.next.next;
        }
    }


