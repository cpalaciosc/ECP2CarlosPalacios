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
        fraction = new Fraction(8, 2);
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

    @Test
    public void testSumar() {
        Fraction operador = new Fraction(1, 2);
        Fraction suma = new Fraction(11, 6);
        assertEquals(suma.getNumerator(), this.fraction.sumar(operador).getNumerator());
        assertEquals(suma.getDenominator(), this.fraction.sumar(operador).getDenominator());
    }
    
    @Test
    public void testRestar() {
        Fraction operador = new Fraction(1, 2);
        Fraction resta = new Fraction(5, 6);
        assertEquals(resta.getNumerator(), this.fraction.restar(operador).getNumerator());
        assertEquals(resta.getDenominator(), this.fraction.restar(operador).getDenominator());
    }
    
    @Test
    public void testMultiplicar() {
        Fraction operador = new Fraction(1, 2);
        Fraction multiplicacion = new Fraction(4, 6);
        assertEquals(multiplicacion.getNumerator(), this.fraction.multiplicar(operador).getNumerator());
        assertEquals(multiplicacion.getDenominator(), this.fraction.multiplicar(operador).getDenominator());
    }
    
    @Test
    public void testDividir() {
        Fraction operador = new Fraction(1, 2);
        Fraction division = new Fraction(8, 3);
        assertEquals(division.getNumerator(), this.fraction.dividir(operador).getNumerator());
        assertEquals(division.getDenominator(), this.fraction.dividir(operador).getDenominator());
    }


}
