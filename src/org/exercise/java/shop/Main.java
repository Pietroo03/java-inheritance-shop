package org.exercise.java.shop;

public class Main {

    public static void main(String[] args) {

        Smartphone onePlus = new Smartphone("OnePlus Nord 2", "Telefono ultra potente", 453f, "115 Gb");

        System.out.println(onePlus.getCodiceImei());
        System.out.println(onePlus.getMemoria());
        System.out.println(onePlus.getDescrizione());

    }
}
