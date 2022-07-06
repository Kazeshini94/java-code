package LinkedList;

public class Node<T> {
    T value;
    Node<T> next;
<<<<<<< HEAD

=======
>>>>>>> 8b3ec42d6e9c35e06df154de39f809e833fcf5ee
    // Basic Layout for Node! ( With String Type )
    Node(T data) {
        value = data;
        next = null;
    }

    // After Defining a Constructor, Base Constructor needs to be written !
    Node() {
        next = null;
    }

}
