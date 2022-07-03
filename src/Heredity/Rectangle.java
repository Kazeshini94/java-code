package Heredity;

import java.awt.*;

public class Rectangle extends Shapes {
    //
    private double length;
    private double width;

    // Constructors
    Rectangle(double length, double width, Color color, boolean isFilled) throws IllegalArgumentException {
        if (width <= 0 || length <= 0)
            throw new IllegalArgumentException("Length or Width can`t be 0 or lower!");
        this.length = length;
        this.width = width;
        setColor(color);
        setFilled(isFilled);
    }
    public Rectangle(double length, double width) throws IllegalArgumentException {
        if (width <= 0 || length <= 0)
            throw new IllegalArgumentException("Length or Width can`t be 0 or lower!");
        this.length = length;
        this.width = width;
    }
    // Methods
    @Override
    public double getArea() {
        return length*width;
    }
    @Override
    public double getPerimeter() {
        return 2*length + 2*width;
    }
    @Override
    public String toString() {
        return String.format("%15s %s %8.2f %s %9.2f %s %10.2f %s %.2f",
                "! Rectangle ! ",
                "\nLength: ", length,
                "\nWidth: ", width,
                "\nArea: " , getArea(),
                "\nPerimeter: " , getPerimeter() );
    }

    // Setter & Getter
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
}