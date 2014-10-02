package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {

    private DecimalCollection decimalCollection;

    @Before
    public void before() {
        this.decimalCollection = new DecimalCollection();
        this.decimalCollection.add(4.5);
        this.decimalCollection.add(8);
    }

    @Test
    public void testDecimalCollection() {
        this.decimalCollection = new DecimalCollection();
        assertEquals(this.decimalCollection.size(), 0);
    }

    @Test
    public void testSize() {
        assertEquals(this.decimalCollection.size(), 2);
    }

    @Test
    public void testSum() {
        assertEquals(this.decimalCollection.sum(), 12.5, 10e-2);
    }

    @Test
    public void testHigher() {
        assertEquals(this.decimalCollection.higher(), 8, 10e-2);
    }
    
    @Test
    public void testMultiply() {
        assertEquals(36, this.decimalCollection.multiply(), 10e-1);
    }

}
