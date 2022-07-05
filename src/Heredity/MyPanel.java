package Heredity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    // Panel Dimensions
    final int panelWidth = 500;
    final int panelHeight = 500;

    // Positions
    int xC = 400, xR = 200, xS = 0;
    int yC = 400, yR = 200, yS = 0;

    // Movement
    int xVelocity = 2;
    int yVelocity = 2;
    Timer timer;

    // Objects I want to draw!
    Circle circle;
    Rectangle rectangle;
    Square square;

    // Constructor for MyPanel, setting base Dimensions and creating Objects to draw!
    MyPanel() {
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setBackground(Color.BLACK);
        timer = new Timer(10, this);
        timer.start();
    }

    // Actually Drawing on the Panel!
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;

        g2D.setColor(square.getColor());
        g2D.drawRect(xS, yS, (int) square.getLength(), (int) square.getLength());
        if (square.isFilled()) {
            g2D.fillRect(xS, yS, (int) square.getLength(), (int) square.getLength());
        }

        g2D.setColor(rectangle.getColor());
        g2D.drawRect(xR, yR, (int) rectangle.getLength(), (int) rectangle.getWidth());
        if (rectangle.isFilled()) {
            g2D.fillRect(xR, yR, (int) rectangle.getLength(), (int) rectangle.getWidth());
        }

        g2D.setColor(circle.getColor());
        g2D.drawOval(xC, yC, (int) circle.getRadius(), (int) circle.getRadius());
        if (circle.isFilled()) {
            g2D.fillOval(xC, yC, (int) circle.getRadius(), (int) circle.getRadius());
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        try {
            // Circle Movement!
            xC -= xVelocity;

            // Rectangle Movement!
            if (yR >= panelHeight - rectangle.getWidth() || yR < 0) {
                yVelocity *= -1;
            }
            yR += yVelocity;
            // Square Movement!
            if (xS >= panelWidth - square.getLength() || xS < 0) {
                xVelocity *= -1;
            }
            xS += xVelocity;
        } catch (NullPointerException ignored) {
        }

        repaint();
    }
}
