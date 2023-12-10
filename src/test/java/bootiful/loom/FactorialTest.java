package bootiful.loom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    Factorial fact = new Factorial();

    @Test
    public void testOne() {
        Assertions.assertEquals(1, fact.factorial(1));
    }
    @Test
    public void testTwo() {
        Assertions.assertEquals(2, fact.factorial(2));
    }

    @Test
    public void testFive() {
        Assertions.assertEquals(120, fact.factorial(5));
    }
    @Test
    public void testZero() {
        try {
            fact.factorial(0);
            Assertions.fail();
        } catch (IllegalArgumentException ex) {
            System.out.println();
        }
    }@Test
    public void testNegative() {
        try {
            fact.factorial(-1);
            Assertions.fail();
        } catch (IllegalArgumentException ex) {
            System.out.println();
        }
    }


}
