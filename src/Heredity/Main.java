package Heredity;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(100, Color.red, true);
        Rectangle rectangle = new Rectangle(160, 120, Color.GREEN, true);
        Square square = new Square(100, Color.WHITE, false);

        // Showing Results of getArea() and getPerimeter()
        System.out.println(circle);
        System.out.println("-----------------");
        System.out.println(rectangle);
        System.out.println("-----------------");
        System.out.println(square);

        // Showing isFilled() and color function
        MyFrame frame = new MyFrame();

        frame.panel.circle = circle;
        frame.panel.rectangle = rectangle;
        frame.panel.square = square;

    }
}