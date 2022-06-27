import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class MeasurementTest {
    @Test
    public void Measurement_0() {
        // TODO: stub for first test
        Measurement m = new Measurement();
        assertEquals(0, m.getFeet());
        assertEquals(0, m.getInches());
    }

    @Test
    public void Measurement_1() {
        Measurement m = new Measurement(4);
        assertEquals(4, m.getFeet());
        assertEquals(0, m.getInches());
    }

    @Test
    public void Measurement_2() {
        Measurement m = new Measurement(4, 3);
        assertEquals(4, m.getFeet());
        assertEquals(3, m.getInches());
    }


    @Test
    public void getFeet() {
        Measurement m = new Measurement(4, 3);
        Measurement m1 = new Measurement(2);
        Measurement m2 = new Measurement();
        assertEquals(4, m.getFeet());
        assertEquals(2, m1.getFeet());
        assertEquals(0, m2.getFeet());
    }

    @Test
    public void getInches() {
        Measurement m = new Measurement(4, 3);
        Measurement m1 = new Measurement(2);
        Measurement m2 = new Measurement();
        assertEquals(3, m.getInches());
        assertEquals(0, m1.getInches());
        assertEquals(0, m2.getFeet());
    }

    @Test
    public void plus() {
        Measurement m = new Measurement(4, 3);
        Measurement m2 = new Measurement(1,4);
        Measurement m3 = new Measurement(1);
        Measurement m4 = new Measurement();

        assertTrue(new Measurement(5,7).equals(m.plus(m2)));
        assertTrue(new Measurement(5,3).equals(m.plus(m3)));
        assertTrue(new Measurement(4,3).equals(m.plus(m4)));

    }

    @Test
    public void minus() {
        Measurement m = new Measurement(4, 8);
        Measurement m2 = new Measurement(1,4);
        Measurement m3 = new Measurement(1);
        Measurement m4 = new Measurement();

        assertTrue(new Measurement(3,4).equals(m.minus(m2)));
        assertTrue(new Measurement(3,8).equals(m.minus(m3)));
        assertTrue(new Measurement(4,8).equals(m.minus(m4)));

    }


    @Test
    public void multiply() {
        Measurement m = new Measurement(0, 7);
        Measurement m2 = new Measurement(1, 7);
        Measurement m3 = new Measurement(2, 7);
        Measurement m4 = new Measurement(2);

        assertTrue(new Measurement(1,9).equals(m.multiple(3)));
        assertTrue(new Measurement(4,9).equals(m2.multiple(3)));
        assertTrue(new Measurement(7,9).equals(m3.multiple(3)));
        assertTrue(new Measurement(6,0).equals(m4.multiple(3)));

    }

    // TODO: Add additional JUnit tests for Measurement.java here.

    @Test
    public void tostring() {
        Measurement m = new Measurement(0, 7);
        assertEquals("0'7\"", m.toString());
    }

}