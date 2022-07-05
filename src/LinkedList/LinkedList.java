package LinkedList;

public class LinkedList<T> {
    // When Creating Object of LinkedList, that object can use Node Head!!
    Node<T> head; // Variable of Type Node called head!
    int counter = 0;

    LinkedList() {
        head = new Node<>((T) "Head");
    }

    // Printing the Full List!
    public void printList() {
        // First Example of Node head usage!! :)
        Node<T> node = head;
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    // Ways of Adding new Nodes!
    public void push(T value) {
        // Creating Node to add with <T> value
        Node<T> newNode = new Node<>(value);

        // To add at the Start of the list!
        newNode.next = head.next; // New Node Pointer copies Head Pointer
        head.next = newNode; // New Node becomes Head Pointer
    }

    public void addAfter(Node<T> addAfter, T value) {
        Node<T> newNode = new Node<>(value);

        // Checking if Node is last Node! which would require other function to add !
        if (addAfter == null) {
            System.out.println("The given Node cannot be NULL");
            return;
        }
        // To add after certain Node!
        newNode.next = addAfter.next; // new Pointer copies existing Node pointer
        addAfter.next = newNode; // Existing Node Pointer becomes new Node
    }

    public void append(T input) {
        Node<T> newNode = new Node<>(input);

        // Checking if head (Start of Nodes) has any value, if not add new Node as Head!
        if (head == null) {
            head = new Node<>(input);
            return;
        }
        newNode.next = null; // Since this will be the Last Node  it Points -> to NULL

        // To Add to the End of the list
        Node<T> temp = head; // we Create temporary Node copying Head
        while (temp.next != null) { // As long as temp does not Point -> to NULL
            temp = temp.next;   // temp becomes the Pointer
        }
        temp.next = newNode; // If we Point -> to NULL , Pointer becomes new Node !
    }

    // Ways to Remove Nodes!
    public void remove() { // Removes All Nodes
        if (head.next != null) { // checks if Head Points -> to NULL
            head = null; // If not head Becomes NULL!
        }
    }

    public void removeFirst() {
        head = head.next; // head becomes the Node It's pointing to !
    }

    public void removeLast() {
        Node<T> temp = head;
        while (temp.next.next != null) { // As long as the NEXT Pointer doesn`t point to NULL (LAST pointer)
            temp = temp.next; // temp becomes the Node its pointing to !!
        }
        temp.next = null; // temp Pointer -> to NULL
    }

    public void remove(T value) {
        // If Head Value is Value to remove! Ignore Case Safe!
        if (head.value == value) {
            head = head.next;
            return;
        }
        Node<T> temp = head;
        // As Long as the Next Node Value does not equal Value
        while (temp.next.value != value) {
            temp = temp.next;
            if (temp.next == null) { // If Value is not in the List! IgnoreCase Safe!
                System.out.println("!Value not Found!");
                return;
            }
        }
        temp.next = temp.next.next; // Temp Pointer skips one Node!
    }

    // Size of the List!
    public int size() {
        int size = 0;
        Node<?> temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    // Getter of Individual Node
    // Per Index
    public String get(int index) {
        Node<T> temp = head;
        int count = 0;

        while (temp != null && count != index) {
            temp = temp.next;
            count++;
        }

        try {
            return (String) temp.value;
        } catch (NullPointerException e) {
            System.out.print("Node = ");
            return null;
        }
    }

    // Per Node Value
    public String getValue(String value) {
        if (head.value == value) {
            return (String) head.value;
        }
        Node<T> temp = head;
        // As Long as the Next Node Value does not equal Value
        while (temp.next.value != value) {
            temp = temp.next;
            if (temp.next == null) { // If Value is not in the List! IgnoreCase Safe!
                return "!!Value not Found!!";
            }
        }
        return temp.next.value.toString(); // returns the value of the next Node as String
    }

    // Wrong Solution ( it works but the method is meh )
    public void reverseIterative() {
        Node<T> temp = head;

        while (temp != null) {
            temp = temp.next;
        }
        temp = head;
        while (counter != 0) {
            temp = temp.next;
        }
    }


    public void reverseRecursive() {

    }
}


