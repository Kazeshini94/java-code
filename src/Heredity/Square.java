package Heredity;

import java.awt.*;

public class Square extends Rectangle {

    Square(double length, Color color, boolean isFilled) throws IllegalArgumentException {
        super(length, length, color, isFilled);
    }

    public Square(double length) throws IllegalArgumentException {
        super(length, length);
    }

    @Override
    public String toString() {
        return String.format("%15s %s %8.2f %s %10.2f %s %.2f",
                "! Square ! ",
                "\nLength: ", getLength(),
                "\nArea: " , getArea(),
                "\nPerimeter: " , getPerimeter() );
    }

    @Override
    public double getLength() {
        return super.getLength();
    }
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }
}