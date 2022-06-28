package OPP1.DoubleLinkedList;


public class Main {
    public static void main(String[] args) {

        List list = new List();

        list.push(666);
        list.append("?END?");
        list.add(2,"ADD"); // if Index is too high  value gets Appended to the end!
        list.append("BAM");
        list.push(2);

        System.out.println("-----START-----");
        list.printList();
        System.out.println("\nThe List contains: " + list.size() + " Nodes!\n");
        list.printListReverse();

        System.out.println("\nList Getter Below!");
        System.out.println(list.seekList(0));
        System.out.println(list.seekListReverse(0));
    }
}
