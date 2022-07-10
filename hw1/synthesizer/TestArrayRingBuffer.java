package synthesizer;
import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the ArrayRingBuffer class.
 *  @author Josh Hug
 */

public class TestArrayRingBuffer {

    @Test
    public void test(){


        ArrayRingBuffer<Double> doubles = new ArrayRingBuffer<>(10);
        doubles.enqueue(1.2);
        doubles.enqueue(1.3);
        doubles.enqueue(1.7);
        doubles.enqueue(2.0);
        for (Double d:
             doubles) {
            System.out.println(d);
        }


    }
    @Test
    // 0 1 2 3 4 5
    public void someTest() {

    }

    /** Calls tests for ArrayRingBuffer. */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestArrayRingBuffer.class);
    }
} 
