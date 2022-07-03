package Heredity;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Shapes circle = new Circle(5);
        Shapes rectangle = new Rectangle(4.2,6.9,Color.GREEN,true);
        Shapes square = new Square(6,Color.WHITE,false);

        // Showing Results of getArea() and getPerimeter()
        System.out.println(circle);
        System.out.println("-----------------");
        System.out.println(rectangle);
        System.out.println("-----------------");
        System.out.println(square);

        // Showing isFilled() and color function
        MyFrame frame = new MyFrame();
    }
}