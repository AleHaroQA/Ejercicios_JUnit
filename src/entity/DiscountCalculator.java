package entity;

public class DiscountCalculator {

    /* 1. Calculadora de Descuentos:
    Crea una clase DiscountCalculator que calcule el descuento aplicado a un producto.
    Escribe pruebas unitarias para verificar que el cálculo del descuento se realiza correctamente
    para diferentes escenarios (por ejemplo, descuento del 10%, descuento máximo, sin descuento, etc.).*/

    //Atributos

    private int precio;
    private int descuento;

    //Constructor

    public DiscountCalculator() {
    }

    public DiscountCalculator(int precio, int descuento) {
        this.precio = precio;
        this.descuento = descuento;
    }

    //Getters y setters

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
