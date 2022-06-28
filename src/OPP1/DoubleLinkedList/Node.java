package OPP1.DoubleLinkedList;

public class Node<T> {

    T value;
    Node<?> next;
    Node<?> prev;

    Node(T type) {
        value = type;
        next = null;
        prev = null;
    }
}