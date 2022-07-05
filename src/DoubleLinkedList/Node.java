package DoubleLinkedList;

public class Node<T> {

    public T value;
    public Node<T> next;
    public Node<T> prev;

    public Node(T type) {
        value = type;
        next = null;
        prev = null;
    }

}