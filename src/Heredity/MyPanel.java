package Heredity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    // Panel Dimensions!
    final int panelWidth = 500;
    final int panelHeigth = 500;

    // Position Variables for different Shapes!
    int xC = 400, yC = 400;
    int xR = 250, yR = 200;
    int xS = 0, yS = 0;

    // Movement speed for my Objects!
    int xVelocity = 5, yVelocity = 5;

    // Timer for implementing moving images!
    Timer timer;

    // Objects I want to draw!
    Circle circle;
    Rectangle rectangle;
    Square square;

    // Constructor for MyPanel, setting base Dimensions and creating Objects to draw!
    MyPanel() {
        this.setPreferredSize(new Dimension(panelWidth,panelHeigth));
        this.setBackground(Color.BLACK);
        timer = new Timer(50,this);
        timer.start();
    }

    // Actually Drawing on the Panel!
    @Override
    public void paint(Graphics g) {
        super.paint(g); // Resets the Whole Image when it gets Updated!
        Graphics2D g2D = (Graphics2D) g; // g2D has more options to use than g!
        // Square
        g2D.setColor(square.getColor());
        g2D.drawRect(xS,yS, (int) square.getLength(), (int) square.getLength());
        if (square.isFilled()) {
            g2D.fillRect(xS,yS, (int) square.getLength(), (int) square.getLength());
        }
        // Rectangle
        g2D.setColor(rectangle.getColor());
        g2D.drawRect(xR,yR, (int) rectangle.getLength(), (int) rectangle.getWidth());
        if (rectangle.isFilled()) {
            g2D.fillRect(xR,yR, (int) rectangle.getLength(), (int) rectangle.getWidth());
        }
        // Circle
        g2D.setColor(circle.getColor());
        g2D.drawOval(xC,yC, (int) circle.getRadius(), (int) circle.getRadius());
        if (circle.isFilled()) {
            g2D.fillOval(xC,yC,(int) circle.getRadius(), (int) circle.getRadius());
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) throws NullPointerException {

        // Movement of Circle!
        xC -= xVelocity;

        // of Rectangle!
        if(yR >= panelHeigth - rectangle.getWidth() || yR < 0) {
            yVelocity *= -1;
        }
        yR += yVelocity;

        // of Square!
        if(xS >= panelWidth - square.getLength() || xS < 0) {
            xVelocity *= -1;
        }
        xS += xVelocity;
        // Redrawing the Image!
        // Without the super call in the paint method we would just add the new Image to the old one!
        repaint();
    }
}
