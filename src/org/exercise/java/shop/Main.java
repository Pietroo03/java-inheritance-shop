package org.exercise.java.shop;

public class Main {

    public static void main(String[] args) {

        Smartphone onePlus = new Smartphone("OnePlus Nord 2", "Telefono ultra potente", 453f, "115 Gb");

        System.out.println(onePlus.getCodiceImei());
        System.out.println(onePlus.getMemoria());
        System.out.println(onePlus.getDescrizione());

        Televisore samsung = new Televisore("Samsung ultra potente 2k25", "Alta qualità sempre!", 875f, "32 pollici",
                true);

        System.out.println(samsung.getPrezzoConIva());
        samsung.setDimensioni("46 pollici");
        System.out.println(samsung.getDimensioni());
        System.out.println(samsung.getSmart());

    }
}
