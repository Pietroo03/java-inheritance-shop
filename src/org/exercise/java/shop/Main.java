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

        Cuffie logitech = new Cuffie("Logitech G432", "Cuffie con riduzione del rumore", 125f, "nere e blu", false);

        System.out.println(logitech.getNomeEsteso());
        System.out.println(logitech.getWireless());
        System.out.println(logitech.getColore());
        logitech.setColore("bianche e rosse");
        System.out.println(logitech.getColore());

    }
}
