package Queue;

import DoubleLinkedList.*;

public class Queue extends List {
    // Constructor
    public Queue() {
        head = new Node<>(0);
        tail = new Node<>(99);

        head.prev = null;
        head.next = tail;

        tail.prev = head;
        tail.next = null;
    }
    public Queue(int first, int last) {
        head = new Node<>(first);
        tail = new Node<>(last);

        head.prev = null;
        head.next = tail;

        tail.prev = head;
        tail.next = null;
    }

    // Functions for Queue aka FiFo - First In First Out
    public void deQueue() {
        if (head == null) {
            System.out.println("Queue is Empty!");
            tail = null;
            return;
        }
        System.out.println(head.value);
        try {
            delete(0);
        } catch (NullPointerException e) {
            head = head.next;
        }
    }
    public void deQueue(int n) {
        int count = n;

        try {
            while(head != null && count != 0) {
                System.out.println(head.value);
                count--;
                head = head.next;
                head.prev = null;
            }
        } catch (NullPointerException e) {
            System.out.println("This deletes the Whole Queue!");
            head = tail = null;
        }
    }
}
