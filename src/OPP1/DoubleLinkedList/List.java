package OPP1.DoubleLinkedList;

public class List {

    Node<?> head;
    Node<?> tail;

    List() {
       head = new Node<>("Hello");
       tail = new Node<>("World");

       head.prev = null;
       head.next = tail;

       tail.prev = head;
       tail.next = null;
    }
    // Ways of Adding Nodes !
    public <T> void push(T value) {
        Node<?> newNode = new Node<>(value);
        // To add at the Start of the list!
        head.prev = newNode; // Head prev Points to new Node!
        newNode.next = head; // New Node next Points -> to actual Head!
        newNode.prev = null; // & prev Points -> to NULL
        head = newNode; // New Node becomes the new Head!
    }
    public <T> void append(T value) {
        Node<?> newNode = new Node<>(value);
        if (tail == null) {
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = null;
        newNode.prev = tail;
        tail = newNode;
    }
    // This Function makes push and append useless! since it incorporates both!
    public <T> void add(int index, T value) {
        Node<?> newNode = new Node<>(value);
        Node<?> temp = head;
        int count = 0;
        while (temp.next != null && count != index) {
            count++;
            temp = temp.next;
        }
        if( temp == head ) {
            newNode.next = head;
            newNode.prev = null;
            head.prev  = newNode;
            head = newNode;
        }
        else if (temp == tail) {
            tail.next = newNode;
            newNode.next = null;
            newNode.prev = tail;
            tail = newNode;
        }
        else {
            temp.prev.next = newNode;
            newNode.prev = temp.prev;
            newNode.next = temp;
            temp.prev = newNode;
        }
    }
    // Ways to Remove !
    public void remove(Node<?> delNode) {
        if (head == delNode) {
            head = delNode.next;
            head.prev = null;
            return;
        }
        if ( delNode.next != null ) { // As long as delNode next does not Point to NULL
            delNode.next.prev = delNode.prev; // next Node prev Pointer becomes  prev Pointer of delNode
        }
        if ( delNode.prev != null) { // As long as delNode prev does not Point to NULL
            delNode.prev.next = delNode.next; // prev Node next Pointer becomes next Pointer of delNode
        }
    }
    public <T> void delete(int index) {
        Node<?> temp = head;
        int count = 0;
        while (temp.next != null && count != index) {
            count++;
            temp = temp.next;
        }
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
    }

    public int size() {
        Node<?> temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    // Output of List in Both Directions!
    public void printList() {
        Node<?> temp = head;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void printListReverse() {
        Node<?> temp = tail;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.prev;
        }
    }
    // Getter of Node Value per Index
    public Object seekList(int index) {
        Node<?> temp = head;
        int count = 0;
        while (temp.next != null && count != index) {
            count++;
            temp = temp.next;
        }
        return temp.value;
    }
    public Object seekListReverse(int index) {
        Node<?> temp = tail;
        int count = 0 ;
        while (temp.prev != null && count != index) {
            count++;
            temp = temp.prev;
        }
        return temp.value;
    }
}