package org.exercise.java.shop;

import java.util.Scanner;

public class Carrello {

    protected Prodotto[] carrelloProdotti;
    Smartphone onePlus = new Smartphone("OnePlus Nord 2", "Telefono ultra potente", 453f, "115 Gb");
    Cuffie logitech = new Cuffie("Logitech G432", "Cuffie con riduzione del rumore", 125f, "nere e blu", false);
    Televisore samsung = new Televisore("Samsung ultra potente 2k25", "Alta qualità sempre!", 875f, "32 pollici", true);

    protected String prodotto;
    Scanner in = new Scanner(System.in);

    public Carrello() {
        carrelloProdotti = new Prodotto[0];
    }

    public void aggiungiProdotto() {
        Prodotto[] nuovoCarrelloProdotti = new Prodotto[carrelloProdotti.length + 1];

        for (int i = 0; i < carrelloProdotti.length; i++) {
            nuovoCarrelloProdotti[i] = carrelloProdotti[i];
        }

        carrelloProdotti = nuovoCarrelloProdotti;

        System.out.print("Inserisci il nome del tuo prodotto: ");
        prodotto = in.nextLine();

        if (prodotto.strip().toLowerCase().equals("oneplus".strip().toLowerCase())) {
            nuovoCarrelloProdotti[nuovoCarrelloProdotti.length - 1] = onePlus;
            System.out.println("Prodotto aggiunto alla tua lista");
        } else if (prodotto.strip().toLowerCase().equals("logitech".strip().toLowerCase())) {
            nuovoCarrelloProdotti[nuovoCarrelloProdotti.length - 1] = logitech;
        } else if (prodotto.strip().toLowerCase().equals("samsung".strip().toLowerCase())) {
            nuovoCarrelloProdotti[nuovoCarrelloProdotti.length - 1] = samsung;
        } else {
            System.out.println("Nessun prodotto corrisponde a: " + prodotto);
        }

        in.close();
    }

    public String getCarrello() {

        String risultato = "Prodotti nel carrello: \n";
        float prezzoTotale = 0;

        for(int i = 0; i < carrelloProdotti.length; i++) {
            risultato += carrelloProdotti[i].getNomeEsteso();
            prezzoTotale += carrelloProdotti[i].getPrezzoConIva();
        }

        return risultato += "Totale: " + prezzoTotale;
    }

    public static void main(String[] args) {


        Carrello carrello = new Carrello();

        carrello.aggiungiProdotto();
        carrello.aggiungiProdotto();

        System.out.println(carrello.getCarrello());
    }
}
