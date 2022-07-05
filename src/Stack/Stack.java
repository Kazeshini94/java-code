package Stack;

import DoubleLinkedList.List;
import DoubleLinkedList.Node;

public class Stack extends List<Number> {
    // Constructors

    public Stack(Number first, Number last) {
        super(first, last);
    }

    // Functions for Stack aka LiFo - Last In / First Out
    public Number peek() throws StackTooSmallException {
        if (tail == null)
            throw new StackTooSmallException("Empty Stack!");
        return tail.value;
    }

    public Number pop() throws StackTooSmallException {
        if (tail == null) {
            throw new StackTooSmallException("Empty Stack!");
        }
        Number pop = 0;

        try {
            pop = tail.value;
            tail = tail.prev;
            tail.next = null;
        } catch (NullPointerException ignored) {
        }
        return pop;
    }

    public Number[] pop(Integer n) throws StackTooSmallException {
        if (tail == null) {
            throw new StackTooSmallException("Empty Stack!");
        }
        Number[] values = new Number[n];
        Node<Number> temp = tail;
        int count = 0;

        try {
            while (count != n || temp != null) {
                values[count] = temp.value;
                temp = temp.prev;
                temp.next = null;
                count++;
            }
        } catch (NullPointerException e) {
            System.out.println("This deletes the Whole Stack!");
            head = tail = null;
        }
        return values;
    }

    @Override
    public int size() {
        Node<Number> temp = tail;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.prev;
        }
        return size;
    }
}
