package Heredity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class RectangleTest {

    Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(2,3);
    }

    @Test
    void getArea() {
        assertEquals(6,rectangle.getArea());
        assertEquals(  rectangle.getArea(),2 * 3);
        assertEquals(6 , rectangle.getLength() * rectangle.getWidth());
        assertEquals(3, rectangle.getArea() / rectangle.getLength());
        assertEquals(2, rectangle.getArea() / rectangle.getWidth());
        rectangle = new Rectangle(6.9,4.2);
        assertEquals(rectangle.getArea() , 6.9 * 4.2);
        assertEquals(4.2, rectangle.getArea() / rectangle.getLength());
        assertEquals(6.9, rectangle.getArea() / rectangle.getWidth());
        assertEquals("28,98", String.format("%.2f", 6.9 * 4.2));
    }

    @Test
    void getPerimeter() {
        assertEquals(10,rectangle.getPerimeter());
        assertEquals(  rectangle.getPerimeter(),2 * 2 + 3 * 2 );
        assertEquals(10 , 2 * rectangle.getLength() + 2 * rectangle.getWidth());
        assertEquals( 3, rectangle.getPerimeter() - (rectangle.getLength() * 2) - rectangle.getWidth());
        assertEquals(2, rectangle.getPerimeter() - (rectangle.getWidth() * 2) - rectangle.getLength());
        rectangle = new Rectangle(6.9,4.2);
        assertEquals(rectangle.getPerimeter() , 2 * 6.9 + 2 * 4.2);
        assertEquals("22,20", String.format("%.2f", 2 * 6.9 + 2 * 4.2));
    }

    @Test
    void exceptionRectangleTest() {
        assertThrows(IllegalArgumentException.class, () -> rectangle = new Rectangle(0,2));
        assertThrows(IllegalArgumentException.class, () -> rectangle = new Rectangle(2,0));
        assertThrows(IllegalArgumentException.class, () -> rectangle = new Rectangle(-5,2.5));
        assertThrows(IllegalArgumentException.class, () -> rectangle = new Rectangle(5,-2.5));
        assertThrows(IllegalArgumentException.class, () -> rectangle = new Rectangle(0,0));
    }
}
