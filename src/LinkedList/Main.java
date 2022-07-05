
  package LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();


        // To Show functionality of created Methods!
//        System.out.println("----START----");
//        list.push("Surprise");
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

        // To Show Removal of the Full List!
//        list.remove();
//        list.size();
//        list.printList();
//
//        System.out.println("----END-3---");

        list.removeFirst();
        list.append("One");
        list.append("Two");
        list.append("Three");
        list.append("Four");

        list.printList();

        System.out.println("-----------");
        list.reverseRecursive(list.size());
        list.printList();



    }
}
