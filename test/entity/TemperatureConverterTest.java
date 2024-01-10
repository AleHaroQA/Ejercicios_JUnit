package entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.TemperatureConverterService;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    TemperatureConverterService tcs;
    TemperatureConverter tc;

    @BeforeEach
    void setUp() {

        this.tcs = new TemperatureConverterService();
        this.tc = new TemperatureConverter();
    }

    @Test
    @Disabled
    void testTemperaturaisNull() {

        assertNotNull(tc.getTemString());

    }

    @Test
    @DisplayName("Celsius a Fahrenheit")
    void testCaF() {

        double esperado;
        double obtenido = tcs.convertirCelsiusaFahrenheit(new TemperatureConverter(35));
        assertEquals(esperado = 10, obtenido, 0, () -> "Se esperaba " + esperado + " y se obtuvo " + obtenido);
        assertEquals(95, tcs.convertirCelsiusaFahrenheit(new TemperatureConverter(35)), 0);
    }

    @Test
    @DisplayName("Fahrenheit a Celsius")
    void testFaC() {

        assertAll(
                () -> assertNotEquals(10, tcs.convertirFahrenheitaCelsius(new TemperatureConverter(58)), 0),
                () -> assertEquals(10, tcs.convertirFahrenheitaCelsius(new TemperatureConverter(58)), 0),
                () -> assertEquals(53.3, tcs.convertirFahrenheitaCelsius(new TemperatureConverter(128)), 0.3),
                () -> assertNotNull(tc.getTemString(), () -> "Es null")
        );
    }

    @Test
    void testCaK() {

        assertEquals(340.15, tcs.convertirCelsiusaKelvin(new TemperatureConverter(67)), 0);
    }

    @Test
    void testKaC() {
        assertEquals(67, tcs.convertirKelvinaCelsius(new TemperatureConverter(340.15)));
    }

    @Test
    void FaK() {
        assertEquals(305.37222222, tcs.convertirFahrenheitaKelvin(new TemperatureConverter(90)), 0.05);
        System.out.println(tcs.convertirFahrenheitaKelvin(new TemperatureConverter(90)));
        assertNotEquals(305.37222222, tcs.convertirFahrenheitaKelvin(new TemperatureConverter(90)), 0);
    }
}