package stack;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    
    Stack stack;
            
    @Before
    public void setUp() {
        stack = new Stack();
        stack.push(5);
        stack.push(10);
        stack.push(7);
        stack.push(15);
        stack.push(-10);
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testOverflow(){
        stack.push(100);
        assertEquals(stack.pop(), -10);
    }

    @Test
    public void getValues() {
        assertEquals(stack.pop(), -10);
        assertEquals(stack.pop(), 15);
        assertEquals(stack.pop(), 7);
        assertEquals(stack.pop(), 10);
        assertEquals(stack.pop(), 5);
    }
    
    @Test
    public void testModify() {
        assertEquals(stack.pop(), -10);
        assertEquals(stack.pop(), 15);
        stack.push(41);
        assertEquals(stack.pop(), 41);
    }
}
