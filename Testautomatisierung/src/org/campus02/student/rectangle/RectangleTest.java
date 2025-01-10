package org.campus02.student.rectangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(2, 4);
    }

    @Test
    void testConstructor() {
        assertEquals(2, rectangle.getA());
        assertEquals(4, rectangle.getB());
    }

    @Test
    void testFailureConstructor() {
        Rectangle r2 = new Rectangle(-1, 4);
        assertEquals(1, r2.getA());
    }

    @Test
    void berechneUmfang() {
        int umfang = rectangle.berechneUmfang();
        assertEquals(12, umfang);

    }

    @Test
    void berechneFlaeche() {
        assertEquals(8, rectangle.berechneFlaeche());
    }
}