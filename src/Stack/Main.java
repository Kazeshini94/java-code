package Stack;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws StackTooSmallException {

        Stack stack = new Stack(3, 69);

        System.out.println("-----Deck----");
        stack.push(666);
        stack.printList();
        System.out.println("-------------");
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        stack.push(33);
        System.out.println(Arrays.toString(stack.pop(3)));
        System.out.println("Stack size = " + stack.size());

    }
}