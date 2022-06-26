package OPP1.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.head = new LinkedList.Node("Header");
        LinkedList.Node second = new LinkedList.Node("Second");
        LinkedList.Node third = new LinkedList.Node("Third");

        list.head.next = second;
        second.next = third;

        // To Show functionality of created Methods!
        System.out.println("----START----");
        list.push("Surprise");
        list.addAfter(second,"bam!");
        list.append("End of Fun!");
        list.printList();
        System.out.println("----END-1---");
        System.out.println(list.getValue("Header"));
        list.remove("surprise");
        list.removeFirst();
        list.removeLast();
        list.printList();
        System.out.println("----END-2---");
        // To Show Removal of the Full List!
        list.remove();
        list.size();
        list.printList();
        System.out.println("----END-3---");
    }
}
