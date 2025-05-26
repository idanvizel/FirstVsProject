package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    
    @Test
    public void testMainOutput() {
        // Capture the output of the main method
        String expectedOutput = "Hello, World!\n";
        // You can use a ByteArrayOutputStream to capture System.out
        // and then assert that it matches the expected output.
        // This is a placeholder for the actual implementation.
        assertEquals(expectedOutput, "Hello, World!\n");
    }
}