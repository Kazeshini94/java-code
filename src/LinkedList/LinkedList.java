package LinkedList;

public class LinkedList<T> {

    // When Creating Object of LinkedList, that object can use Node Head!!
    Node<T> head; // Variable of Type Node called head!
    int counter;
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

    /*
     Useless Method since the Method below handles it better!
        public void remove(Node remove) {
            Node temp = head;  // Create temporary Node copying head!
            while(temp.next != remove) { // Runs until Pointer of temp shows to Remove
                temp = temp.next;
            }
            temp.next = remove.next; // Temp Pointer becomes Remove Pointer!
                                    // Skipping the actual Remove Node
        }
        */
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
        Node<T> temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    // Getter of Individual Node
    // Per Index
    public T get(int index) {
        Node<T> temp = head;
        int count = 0;

        while (temp != null && count != index) {
            temp = temp.next;
            count++;
        }

        try {
            return temp.value;
        } catch (NullPointerException npe) {
            System.out.print("Node = ");
            return null;
        }
    }

    // Per Node Value
    public T getValue(T value) {
        if (head.value == value) {
            return head.value;
        }
        Node<T> temp = head;
        // As Long as the Next Node Value does not equal Value
        while (temp.next.value != value) {
            temp = temp.next;
            if (temp.next == null) { // If Value is not in the List! IgnoreCase Safe!
                return (T) "!!Value not Found!!";
            }
        }
        // returns the value of the next Node as String
        return temp.next.value;
    }

    public void reverseIterative() {
        Node<T> temp = head;

        // Iterating to the Last Node!
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = head; // Setting Last Node Pointer to Head!
        temp = head.next; // tempNode starts at Second Node!
        head.next = null; // Head points to NULL
        head = temp.next; // Head becomes the Third Node!

        temp.next = head.next.next; // Second Node points to previous Head node!
        head.next.next = temp; // Last Node Pointer becomes Second Node!
        temp = head.next; // tempNode becomes the Fourth Node / Last Node!
        head.next = temp.next; // Third Node points to second!
        temp.next = head; // Last Node Points to Third!
        head = temp; // Head becomes the Last Node!
    }

    public void reverseRecursive(int size) {
        if (size <= 0) {
            return;
        }

        Node<T> temp = head.next;
        counter = 0;

        while (temp.next != null || counter != size) {
            temp = temp.next;
            head = temp;
            counter++;
        }
        reverseRecursive(size-1);

    }
}


