package DoubleLinkedList;

public class Node<T> {

    public T value;
    public Node<?> next;
    public Node<?> prev;

    public Node(T type) {
        value = type;
        next = null;
        prev = null;
    }
}