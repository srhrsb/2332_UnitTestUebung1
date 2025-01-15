package com.brh.htmlTrainer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("Addition")
    void testSum() {
        assertEquals( 10, Main.sum(4, 6), "Addition korrekt" );
    }

    @Test
    void testMultiply() {
        assertEquals( 12, Main.multiply(2, 6), "Multiplikation korrekt" );
    }

    @RepeatedTest(5)
    void testMultiplyZero(){
        assertEquals( 0, Main.multiply(0,5), "Multiplikation mit 0");
        assertEquals( 0, Main.multiply(5,0), "Multiplikation mit 0");
    }


    @Test
    void getNewCar() {

        Car car = Main.getNewCar();
        assertNotNull(car, "Nicht ungueltig");

    }
}