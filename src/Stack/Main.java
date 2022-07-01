package Stack;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(3,69);

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
        stack.pop(2);
        System.out.println("Stack size = " + stack.size());
        stack.peek();

    }
}
