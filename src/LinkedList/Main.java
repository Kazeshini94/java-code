package LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

//
//        // To Show functionality of created Methods!
//        System.out.println("----START----");
//        list.push("Surprise");
//        list.addAfter(list.head, String.valueOf(69));
//        list.append("End of Fun!");
//        list.push("PUSH-TEST");
//        list.printList();
//
//        System.out.println("----END-1---");
//
//        System.out.println(list.getValue("Head"));
//        System.out.println(list.get(5));
//        list.removeFirst();
//        list.removeLast();
//        list.printList();
//
//        System.out.println("----END-2---");
//
//        // To Show Removal of the Full List!
//        list.remove();
//        list.size();
//        list.printList();
//
//        System.out.println("----END-3---");

        list.removeFirst();
        System.out.println("------BASE------");
        list.append("First");
        list.append("Second");
        list.append("Third");
        list.append("Fourth");
        list.append("Fifth");
        list.append("69");


        list.printList();
        System.out.println("-----SECOND------");
        list.reverseList(list.size());
        list.append("!BAM!");
        list.printList();

        System.out.println("------THIRD------");
        list.reverseList(list.size());
        list.printList();

        //Output printList -> First, Second, Third, Fourth  (head == First)

        // list.reverse()

        // Output printList -> Fourth, Third, Second, First (head == Fourth)

        // list.append("Fifth")

        // Output printList -> Fourth, Third, Second, First, Fifth
    }
}
