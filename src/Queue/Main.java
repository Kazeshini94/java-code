package Queue;

public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue(3, 69);

        queue.append(666);

        queue.printList();
        System.out.println("Queue size = " + queue.size());
        queue.deQueue(2);
        System.out.println("Queue size = " + queue.size());
        queue.deQueue(2);
        queue.deQueue();
    }
}
