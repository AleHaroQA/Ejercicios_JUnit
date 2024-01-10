package entity;

public class TemperatureConverter {

    /*2. Conversión de Temperatura:
    Crea una clase TemperatureConverter que convierta entre diferentes unidades de temperatura
    (por ejemplo, Celsius, Fahrenheit, Kelvin).
    Escribe pruebas unitarias para asegurarte de que la conversión entre las diferentes unidades
    se realiza correctamente y produce los resultados esperados.*/

    //Atributos

    private double temperatura;
    private String temString;

    //Constructores

    public TemperatureConverter() {
    }

    public TemperatureConverter(double temperatura) {

        this.temperatura = temperatura;

    }

    //Getters y setters

    public double getTemperatura() {
        return temperatura;
    }

    public String getTemString() {
        return temString;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
