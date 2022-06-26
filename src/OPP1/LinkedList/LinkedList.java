package OPP1.LinkedList;

public class LinkedList  {
    // When Creating Object of LinkedList, that object can take the Value of Node head!
    Node head; // Variable of Type Node called head!
    // Basic Layout for Node! ( With String Type )
    static class Node {
        String text;
        Node next;
        Node(String input) {
            text = input;
            next = null;
        }
    }
    // Printing the Full List!
    public void printList() {
        // First Example of Node head usage!! :)
        Node node = head;
        while (node != null) {
            System.out.println(node.text + " ");
            node = node.next;
        }
    }

    // Ways of Adding new Nodes!
    public void push(String text) {
        // Creating Node to add with <T> value
        Node newNode = new Node(text);

        // To add at the Start of the list!
        newNode.next = head; // New Node Points -> to actual Head!
        head = newNode; // New Node becomes the new Head!
    }
    public void addAfter(Node addAfter, String text) {
        Node newNode = new Node(text);

        // Checking if Node is last Node! which would require other function to add !
        if (addAfter == null) {
            System.out.println("The given Node cannot be NULL");
            return;
        }
        // To add after certain Node!
        newNode.next = addAfter.next; // new Pointer copies existing Node pointer
        addAfter.next = newNode; // Existing Node Pointer becomes new Node
    }
    public void append(String text) {
        Node newNode = new Node(text);

        // Checking if head (Start of Nodes) has any value, if not add new Node as Head!
        if (head == null) {
            head = new Node(text);
            return;
        }
        newNode.next = null; // Since this will be the Last Node  it Points -> to NULL

        // To Add to the End of the list
        Node temp = head; // we Create temporary Node copying Head
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
        Node temp = head;
        while( temp.next.next != null) { // As long as the NEXT Pointer doesn`t point to NULL (LAST pointer)
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
    public void remove(String value) {
        // If Head Value is Value to remove! Ignore Case Safe!
        if (head.text.equalsIgnoreCase(value)) {
            head = head.next;
            return;
        }
        Node temp = head;
        // As Long as the Next Node Value does not equal Value
        while (!temp.next.text.equalsIgnoreCase(value)) {
            temp = temp.next;
            if (temp.next == null) { // If Value is not in the List! IgnoreCase Safe!
                System.out.println("!Value not Found!");
                return;
            }
        }
        temp.next = temp.next.next; // Temp Pointer skips one Node!
    }

    // Size of the List!
    public void size() {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        System.out.println(size);
    }

    // Getter of Individual Node
    public Node get(String value) {
        if (head.text.equalsIgnoreCase(value)) {
            return head;
        }
        Node temp = head;
        // As Long as the Next Node Value does not equal Value
        while (!temp.next.text.equalsIgnoreCase(value)) {
            temp = temp.next;
            if (temp.next == null) { // If Value is not in the List! IgnoreCase Safe!
                System.out.println("!Value not Found!");
                return null;
            }
        }
        return temp.next.next; // skip a Node and then Return the Node of the next Pointer
    }
}


