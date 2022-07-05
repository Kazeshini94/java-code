package DoubleLinkedList;


public class Main {
    public static void main(String[] args) {

        List<String> list = new List<>("Head", "Tail");


        list.push(String.valueOf(666));
        list.append("?END?");
        list.add(2, "ADD"); // if Index is too high  value gets Appended to the end!
        list.append("BAM");

        System.out.println("-----START-----");
        list.printList();
        System.out.println("\nThe List contains: " + list.size() + " Nodes!\n");
        list.printListReverse();

        System.out.println("\nList Getter Below!");
        System.out.println(list.seekList(0));
        System.out.println(list.seekListReverse(0));
    }
}
