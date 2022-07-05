package Heredity;

import java.awt.*;

public abstract class Shapes {
    // Parameter
    private Color color;
    private boolean isFilled;

    // Methods which every subclass inherits!
    public abstract double getArea();
    public abstract double getPerimeter();

    // Setter & Getter
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }
    public void setFilled(boolean filled) {
        isFilled = filled;
    }
}