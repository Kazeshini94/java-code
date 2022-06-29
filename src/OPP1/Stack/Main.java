package OPP1.Stack;

import OPP1.DoubleLinkedList.List;


public class Main {
    public static void main(String[] args) {


        List stack = new List(3,69);

        System.out.println("-----Deck----");
        stack.push(666);
        stack.printList();
        System.out.println("-------------");
        System.out.print("POP ");
        stack.pop();
        System.out.println("------------");
        System.out.print("PEEK ");
        stack.peek();
        stack.push(666);
        System.out.print("POP ");
        stack.pop();
        System.out.print("POP ");
        stack.pop();
        System.out.println("Stack size = " + stack.size());
        stack.peek();


    }
}
