package Heredity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SquareTest {

    Square square;

    @Test
    void exceptionSquareTest() {
        assertThrows(IllegalArgumentException.class, () -> square = new Square(0));
        assertThrows(IllegalArgumentException.class, () -> square = new Square(-5));
    }
}
