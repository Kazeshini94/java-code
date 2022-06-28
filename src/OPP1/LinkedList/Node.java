package LinkedList;

public class Node<T> {
    T value;
    Node<?> next;

    Node(T data) {
        value = data;
        next = null;
    }
}
