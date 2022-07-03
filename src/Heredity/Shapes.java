package Heredity;

import java.awt.*;

public abstract class Shapes {

    private Color color;
    private boolean isFilled;

    public abstract double getArea();
    public abstract double getPerimeter();

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