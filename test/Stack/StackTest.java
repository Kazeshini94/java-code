package Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    Stack stack;

    @BeforeEach
    public void setUp() {
        stack = new Stack();
    }

    @Test
    public void pushTest() {
        assertEquals(0,stack.head.value);
        stack.push(66);
        assertEquals(66,stack.head.value);
        stack.push("Test");
        assertEquals("Test",stack.head.value);
        stack.push(4.2);
        assertEquals(4.2,stack.head.value);
        stack.push(null);
        assertNull(stack.head.value);
    }

    @Test
    public void peekTest() {
        assertEquals(99,stack.tail.value);
        stack.add(6,"Test");
        assertEquals("Test",stack.tail.value);
        stack.append(4.2);
        assertEquals(4.2,stack.tail.value);
        stack.append(null);
        assertNull(stack.tail.value);
    }

    @Test
    public void popTest() {
        assertEquals(2,stack.size());
        stack.pop();
        assertEquals(1,stack.size());
        assertEquals(0,stack.tail.value);
        stack.pop();
        assertNull(stack.tail);
        assertEquals(0,stack.size());
        stack.add(0,"BAM");
        stack.push(420);
        stack.append(69);
        stack.pop(2);
        assertEquals(0,stack.size());
    }
}
