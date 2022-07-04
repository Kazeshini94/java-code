package Heredity;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Creating Different Shape Objects
        Circle circle = new Circle(100, Color.red, true);
        Rectangle rectangle = new Rectangle(142, 169, Color.GREEN, true);
        Square square = new Square(100, Color.WHITE, false);

        // Showing isFilled() and color function
        MyFrame frame = new MyFrame();
        // Adding my Object to the Panel on which we draw!
        frame.panel.circle = circle;
        frame.panel.rectangle = rectangle;
        frame.panel.square = square;


        // Showing Results of getArea() and getPerimeter()
        System.out.println(circle);
        System.out.println("-----------------");
        System.out.println(rectangle);
        System.out.println("-----------------");
        System.out.println(square);

    }
}