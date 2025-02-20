package org.exercise.java.shop;

public class Main {

    public static void main(String[] args) {

        Smartphone onePlus = new Smartphone("OnePlus Nord 2", "Telefono ultra potente", 453f, "115 Gb");
        Cuffie logitech = new Cuffie("Logitech G432", "Cuffie con riduzione del rumore", 125f, "nere e blu", false);
        Televisore samsung = new Televisore("Samsung ultra potente 2k25", "Alta qualità sempre!", 875f, "32 pollici", true);

        System.out.println(logitech.getPrezzoBase());
    }
}
