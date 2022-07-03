package Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class QueueTest {

    Queue queue;

    @BeforeEach
    public void setUp() {
        queue = new Queue();
    }

    @Test
    public void deQueueTest() {
        assertEquals(0,queue.head.value);
        assertEquals(2,queue.size());
        queue.deQueue();
        assertEquals(1,queue.size());
        assertEquals(99,queue.head.value);
        queue.deQueue();
        assertEquals(0,queue.size());
        assertNull(queue.head);
        queue.push(66);
        queue.add(1,"YoLo");
        queue.append("The End");
        queue.deQueue(2);
        assertEquals(1,queue.size());
        assertEquals("The End",queue.head.value);
    }
}
