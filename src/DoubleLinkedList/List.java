package DoubleLinkedList;

public class List<T> {

    public Node<T> head;
    public Node<T> tail;

    public List(T first, T last) {
        head = new Node<>(first);
        tail = new Node<>(last);

        head.prev = null;
        head.next = tail;

        tail.prev = head;
        tail.next = null;
    }

    // Ways of Adding Nodes !
    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            tail = head;
            return;
        }
        // To add at the Start of the list!
        head.prev = newNode; // Head prev Points to new Node!
        newNode.next = head; // New Node next Points -> to actual Head!
        newNode.prev = null; // & prev Points -> to NULL
        head = newNode; // New Node becomes the new Head!
    }

    public void append(T value) {
        Node<T> newNode = new Node<>(value);
        if (tail == null) {
            tail = newNode;
            head = tail;
            return;
        }
        tail.next = newNode;
        newNode.next = null;
        newNode.prev = tail;
        tail = newNode;
    }

    // This Function makes push and append useless! since it incorporates both!
    public void add(Integer index, T value) {
        Node<T> newNode = new Node<>(value);
        Node<T> temp = head;
        Integer count = 0;
        while (temp.next != null && !count.equals(index)) {
            count++;
            temp = temp.next;
        }
        if (temp == head) {
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        } else if (temp == tail) {
            tail.next = newNode;
            newNode.next = null;
            newNode.prev = tail;
            tail = newNode;
        } else {
            temp.prev.next = newNode;
            newNode.prev = temp.prev;
            newNode.next = temp;
            temp.prev = newNode;
        }
    }

    // Ways to Remove !
    public void remove(Node<T> delNode) {
        if (head == delNode) {
            head = head.next;
            head.prev = null;
            return;
        }
        if (delNode.next != null) { // As long as delNode next does not Point to NULL
            delNode.next.prev = delNode.prev; // next Node prev Pointer becomes  prev Pointer of delNode
        }
        if (delNode.prev != null) { // As long as delNode prev does not Point to NULL
            delNode.prev.next = delNode.next; // prev Node next Pointer becomes next Pointer of delNode
        }
    }

    public void delete(Integer index) {
        Node<T> temp = head;
        int count = 0;
        while (temp.next != null && count != index) {
            count++;
            temp = temp.next;
        }
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
    }

    public int size() {
        Node<T> temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    // Output of List in Both Directions!
    public void printList() {
        Node<T> temp = head;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printListReverse() {
        Node<T> temp = tail;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.prev;
        }
    }

    // Getter of Node Value per Index
    public T seekList(Integer index) {
        Node<T> temp = head;
        Integer count = 0;
        while (temp.next != null && !count.equals(index)) {
            count++;
            temp = temp.next;
        }
        return temp.value;
    }

    public T seekListReverse(Integer index) {
        Node<T> temp = tail;
        Integer count = 0;
        while (temp.prev != null && !count.equals(index)) {
            count++;
            temp = temp.prev;
        }
        return temp.value;
    }
}
