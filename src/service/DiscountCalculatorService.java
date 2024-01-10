package service;

import entity.DiscountCalculator;

public class DiscountCalculatorService {

    public int calcularDescuento(DiscountCalculator ds) {

        int descuento =  (ds.getPrecio()*ds.getDescuento())/100;
        return descuento;
    }
}
