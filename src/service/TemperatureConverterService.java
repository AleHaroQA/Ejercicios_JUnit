package service;

import entity.TemperatureConverter;


public class TemperatureConverterService {

    //Celsius, Fahrenheit, Kelvin


    public double convertirCelsiusaFahrenheit(TemperatureConverter tc) {

        double fahrenheit = (tc.getTemperatura() * 1.8) + 32;
        return fahrenheit;
    }

    public double convertirFahrenheitaCelsius(TemperatureConverter tc) {

        return (tc.getTemperatura() - 32) / 1.8;
    }

    public double convertirCelsiusaKelvin(TemperatureConverter tc) {

        return tc.getTemperatura() + 273.15;
    }

    public double convertirKelvinaCelsius(TemperatureConverter tc) {

        return tc.getTemperatura() - 273.15;
    }

    //(90 °F – 32) ÷ 1,8 + 273,15.
    //(60 ° F + 459,67) × 5/9 = 288,71 K

    public double convertirFahrenheitaKelvin(TemperatureConverter tc) {

        return (((5 * (tc.getTemperatura() - 32)) / 9) + 273.1);
    }
}
