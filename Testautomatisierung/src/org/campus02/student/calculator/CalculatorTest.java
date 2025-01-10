package org.campus02.student.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class CalculatorTest {

    int a;
    String s;
    boolean booli;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Wird einmal am Beginn ausgeführt");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Werde vor jedem Test aufgerufen");
    }

    @Test
    @DisplayName("test addition")
    void add() {
        int result = Calculator.add(2, 3);
        int expected = 5;

        assertEquals(expected, result);

    }

    @Test
    @DisplayName("test subtract")
    void subtract() {
        int result = Calculator.subtract(5,6);
        int expected = -1;

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test multi")
    void multiply() {
        int result = Calculator.multiply(2,3);
        int expected = 6;

        assertEquals(expected, result);

        assertEquals(10, Calculator.multiply(2,5));
    }

    @Test
    void isEquals() {
        assertTrue(Calculator.isEquals(1, 1));
    }

    @Test
    void isNotEquals() {
        assertFalse(Calculator.isEquals(1, 2));
    }
}