package Queue;

import DoubleLinkedList.List;

public class Queue extends List<Number> {
    // Constructor
    public Queue(Number first, Number last) {
        super(first, last);
    }

    // Functions for Queue aka FiFo - First In First Out
    public Number deQueue() {
        if (head == null) {
            System.out.println("Queue is Empty!");
            tail = null;
            return null;
        }
        Number value = 0;

        try {
            value = head.value;
            head = head.next;
            head.prev = null;
        } catch (NullPointerException ignored) {
        }
        return value;
    }

    public Number[] deQueue(int n) {
        int count = 0;
        Number[] values = new Number[n];


        try {
            while (head != null && count != n) {
                values[count] = head.value;
                head = head.next;
                head.prev = null;
                count++;
            }
        } catch (NullPointerException e) {
            System.out.println("This deletes the Whole Queue!");
            head = tail = null;
        }
        return values;
    }
}
