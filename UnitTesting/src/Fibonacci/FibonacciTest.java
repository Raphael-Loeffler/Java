package Fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    void testFibonacci() {
        assertEquals(144, Fibonacci.fibonacci(12));
    }
}
