
import org.w3c.dom.Node;
import DoubleLinkedList.List;

public class Stack {

    Node head;
    Node tail;

    // Constructors
    public Stack() {
        head = new Node(0);
        tail = new Node(99);

        head.prev = null;
        head.next = tail;

        tail.prev = head;
        tail.next = null;
    }
    public Stack(int first, int last) {
        head = new Node<>(first);
        tail = new Node<>(last);

        head.prev = null;
        head.next = tail;

        tail.prev = head;
        tail.next = null;
    }
    // Functions for Stack aka LiFo - Last In / First Out
    public void peek() {
        try {
            System.out.println(tail.value);
        } catch (NullPointerException e) {
            System.out.println("!Empty Stack!");
        }
    }
    public void pop() {
        try {
            peek();
            tail = tail.prev;
            tail.next = null;
            if (head == tail) {
                head = tail = null;
            }
        } catch (NullPointerException ignored){
        }
    }
    public void pop(int n) {
        Node<?> temp = tail;
        int count = n;

        try {
            do {
                System.out.println(tail.value);
                tail = tail.prev;
                tail.next = null;
                if (head == tail) {
                    head = tail = null;
                }
                count--;
            } while (count != 0);
//            while(temp != null && count != 0) {
//                System.out.println(temp.value);
//                count--;
//                temp = temp.prev;
//                temp.next = null;
//            }
        } catch (NullPointerException e) {
            System.out.println("This deletes the Whole Stack!");
            head = tail = null;
        }
    }
}
