package Heredity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle(3);
    }

    @Test
    void getArea() {
        assertEquals( circle.getArea() ,Math.PI * 3 * 3);
        assertEquals("28,27", String.format("%.2f",Math.PI * 3 * 3) );
        assertEquals(1,circle.getArea() / (Math.PI * circle.getRadius() * circle.getRadius()));
        assertEquals( circle.getRadius() * circle.getRadius(), circle.getArea() / Math.PI );
        assertEquals( Math.PI, circle.getArea() /(circle.getRadius() * circle.getRadius()));
        circle = new Circle(5);
        assertEquals(1,circle.getArea() / (Math.PI * circle.getRadius() * circle.getRadius()));
        assertEquals( circle.getRadius() * circle.getRadius(), circle.getArea() / Math.PI );
        assertEquals( Math.PI, circle.getArea() /(circle.getRadius() * circle.getRadius()));
    }

    @Test
    void getPerimeter() {
        assertEquals(circle.getPerimeter(), Math.PI * 2 * 3);
        assertEquals("18,85", String.format("%.2f",Math.PI * 2 * 3));
        assertEquals(circle.getRadius() * 2, circle.getPerimeter() / Math.PI);
        assertEquals(Math.PI, circle.getPerimeter() / (2 * circle.getRadius()));
        circle = new Circle(5);
        assertEquals(circle.getPerimeter(), Math.PI * 2 * 5);
        assertEquals(circle.getRadius() * 2, circle.getPerimeter() / Math.PI);
        assertEquals(Math.PI, circle.getPerimeter() / (2 * circle.getRadius()));
    }

    @Test
    void exceptionCircleTest() {
        assertThrows(IllegalArgumentException.class, () -> circle = new Circle(0));
        assertThrows(IllegalArgumentException.class, () -> circle = new Circle(-5));
    }
}
