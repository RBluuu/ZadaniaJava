package com.java.course.com.lesson46.objectcontainer;

public class Node<E> {
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
