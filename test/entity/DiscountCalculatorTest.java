package entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.DiscountCalculatorService;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {

    DiscountCalculatorService dcs;

    @BeforeEach
    void setUp() {
        dcs = new DiscountCalculatorService();
    }

    @Test
    public void testDescuento10() {
        assertEquals(100,dcs.calcularDescuento(new DiscountCalculator(1000,10)));
    }

    @Test
    void testDescuentoMax() {
        assertEquals(1000, dcs.calcularDescuento(new DiscountCalculator(1000, 100)));
    }

    @Test
    void testDescuento0() {
        assertEquals(2, dcs.calcularDescuento(new DiscountCalculator(1000, 0)));
    }

    @Test
    void testDescuento50() {

        assertEquals(500, dcs.calcularDescuento(new DiscountCalculator(1000, 50)));
    }



}