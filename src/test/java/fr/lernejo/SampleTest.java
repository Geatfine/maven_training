package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void op() {
        assertEquals(8, new Sample().op(Sample.Operation.ADD, 4, 4));
        assertEquals(16, new Sample().op(Sample.Operation.MULT, 4, 4));
    }

    @Test
    void fact() {
        assertEquals(6, new Sample().fact(3));
        assertEquals(24, new Sample().fact(4));
    }
}
