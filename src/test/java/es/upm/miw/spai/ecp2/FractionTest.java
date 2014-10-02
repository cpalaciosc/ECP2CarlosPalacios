package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    
   private Fraction fraction;
   
   @Before
   public void before() {
       fraction = new Fraction(4, 3);
   }   

    @Test
    public void testFractionIntInt() {
        fraction = new Fraction(8,2);
        assertEquals(8, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
    }

    @Test
    public void testFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(1.33, fraction.decimal(), 10e-2);
    }
    
    @Test
    public void testIsPropia() {
        assertTrue(this.fraction.isPropia());
    }
    
    @Test
    public void testIsImpropia() {
        assertFalse(this.fraction.isImpropia());
    }
    
    @Test
    public void testIsEquivalente() {
        Fraction equivalente = new Fraction(20, 15);
        Fraction noEquivalente = new Fraction(21, 15);
        assertTrue(this.fraction.isEquivalente(equivalente));
        assertFalse(this.fraction.isEquivalente(noEquivalente));
    }

}
