package DoubleLinkedList;


public class Main {
    public static void main(String[] args) {

        List list = new List();

        list.push(666);
        list.add(2,"ADD");
        list.append("?END?");


        list.printList();
        System.out.println("The List contains: " + list.size() + " Nodes!" );
        list.printListReverse();

        System.out.println("List Getter Below!");
        System.out.println(list.seekList(0).value);
        System.out.println(list.seekListReverse(0).value);
    }
}
