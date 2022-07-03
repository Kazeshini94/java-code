package Heredity;

import java.awt.*;

public class Circle extends Shapes {

    private double radius;

    Circle(int radius) throws IllegalArgumentException{
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius can`t be 0 or Negative!");
        }
        this.radius = radius;
    }
    Circle(double radius, Color color, boolean isFilled) throws IllegalArgumentException{
        if (radius <= 0)
            throw new IllegalArgumentException("Radius can`t be 0 or Negative!");
        this.radius = radius;
        setColor(color);
        setFilled(isFilled);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return String.format("%15s %s %8.2f %s %10.2f %s %.2f",
                "! Circle ! ",
                "\nRadius: " , radius,
                "\nArea: " , getArea(),
                "\nPerimeter: " ,getPerimeter() );
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}