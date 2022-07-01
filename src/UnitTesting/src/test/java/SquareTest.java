import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {

    private Square square;

    //This Method will be executed before each other test method
    @BeforeEach
    void setUp() {
        square = new Square();
    }

    //Tests for squared Values
    @Test
    void calculateTest() {
        //expected Value is 4 when we calculate 2*2
        assertEquals(4, square.calculate(2));
        //expected Value is 9 when we calculate 3*3
        assertEquals(9, square.calculate(3));
        //expected Value is 0 when we calculate 0*0
        assertEquals(0, square.calculate(0));
        //expected Value is 1 when we calculate 1*1
        assertEquals(1, square.calculate(1));
    }

    @Test //Test for an IllegalArgument
    void exceptionCalculateTest() {
        //When we call the Method with -1, we expect that an IllegalArgumentException is thrown
        assertThrows(IllegalArgumentException.class, () -> square.calculate(-1));
    }
}