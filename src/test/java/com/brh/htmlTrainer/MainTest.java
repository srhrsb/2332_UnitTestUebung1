package com.brh.htmlTrainer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("Simple Addition should work")
    void testSum() {
        assertEquals(10, Main.sum(4,6),
              "Addition should work");

    }

    @Test
    @DisplayName("Simple Multiply should work")
    void testMultiply() {
        assertEquals(20, Main.multiply(4, 5),
                "Multiply should work");
    }

    @RepeatedTest(5)
    @DisplayName("Ensure correct handling of zero")
    void testMultiplyWithZero(){
        assertEquals(0, Main.multiply(0,5), "Multiply with zero");
        assertEquals(0, Main.multiply(5,0), "Multiply with zero");
    }



}