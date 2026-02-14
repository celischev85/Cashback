package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class SampleTest {
    @Test
    public void additionTest() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void stringNotNullTest() {
        String str = "Junit4 Test";
        assertNotNull(str);
    }
}

