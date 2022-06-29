package OPP1.Queue;

import OPP1.DoubleLinkedList.List;

public class Main {
    public static void main(String[] args) {

        List queue = new List(3,69);

        queue.append(666);

        queue.printList();
        System.out.println("Queue size = " + queue.size() );
        queue.dequeue(2);
        System.out.println("Queue size = " + queue.size() );
        queue.dequeue(2);
        queue.dequeue();

    }
}
