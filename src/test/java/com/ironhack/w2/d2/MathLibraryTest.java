package com.ironhack.w2.d2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathLibraryTest {

    @Test
    void multiply_smallInt_correctProduct() {
        assertEquals(10, MathLibrary.multiply(2, 5));
    }
    @Test
    void multiply_largeInt_illegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            MathLibrary.multiply(900000000, 400000000);
        });


    }

}