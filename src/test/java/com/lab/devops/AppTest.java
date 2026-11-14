package com.lab.devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AppTest {
    @Test
    public void testAdd() {
        assertEquals(15, App.add(5, 10));
    }

    @Test
    public void testAddNegative() {
        assertEquals(-5, App.add(5, -10));
    }

    @Test
    public void testMain() {
        assertDoesNotThrow(() -> App.main(new String[0]));
    }
}
