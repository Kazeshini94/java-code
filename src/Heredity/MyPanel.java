package Heredity;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    // Objects I want to draw!
    Circle circle;
    Rectangle rectangle;
    Square square;

    // Constructor for MyPanel, setting base Dimensions and creating Objects to draw!
    MyPanel() {
        this.setPreferredSize(new Dimension(500,500));
        circle = new Circle(50, Color.red, true);
        rectangle = new Rectangle(100,150, Color.GREEN, false);
        square = new Square(200, Color.cyan, true);
    }

    // Actually Drawing on the Panel!
    @Override
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        if (circle.isFilled()) {
            g2D.setColor(circle.getColor());
            g2D.fillOval(400,400,(int) circle.getRadius(), (int) circle.getRadius());
        }
        if (!circle.isFilled()) {
            g2D.setColor(circle.getColor());
            g2D.drawOval(400,400, (int) circle.getRadius(), (int) circle.getRadius());
        }
        if (rectangle.isFilled()) {
            g2D.setColor(rectangle.getColor());
            g2D.fillRect(250,200, (int) rectangle.getLength(), (int) rectangle.getWidth());
        }
        if (!rectangle.isFilled()){
            g2D.setColor(rectangle.getColor());
            g2D.drawRect(250,200, (int) rectangle.getLength(), (int) rectangle.getWidth());
        }
        if (square.isFilled()) {
            g2D.setColor(square.getColor());
            g2D.fillRect(0,0, (int) square.getLength(), (int) square.getLength());
        }
        if (!square.isFilled()) {
            g2D.setColor(square.getColor());
            g2D.drawRect(0,0, (int) square.getLength(), (int) square.getLength());
        }
    }
}
