package org.exercise.java.shop;

import java.util.Scanner;

public class Carrello {

    protected Prodotto[] carrelloProdotti;
    protected Smartphone onePlus = new Smartphone("OnePlus Nord 2", "Telefono ultra potente", 453f, "115 Gb");
    protected Cuffie logitech = new Cuffie("Logitech G432", "Cuffie con riduzione del rumore", 125f, "nere e blu", false);
    protected Televisore samsung = new Televisore("Samsung ultra potente 2k25", "Alta qualità sempre!", 875f, "32 pollici", true);

    public Carrello() {
        carrelloProdotti = new Prodotto[0];
    }

    public void aggiungiProdotto() {
        Scanner in = new Scanner(System.in);
        String inputInserito;

        Prodotto[] nuovoCarrelloProdotti = new Prodotto[carrelloProdotti.length + 1];

        for (int i = 0; i < carrelloProdotti.length; i++) {
            nuovoCarrelloProdotti[i] = carrelloProdotti[i];
        }

        carrelloProdotti = nuovoCarrelloProdotti;

        System.out.print("Inserisci il nome del tuo prodotto: ");
        inputInserito = in.nextLine();

        // cambaire con switch, chiedere il tipo di prodotto, non il titolo

        switch (inputInserito.toLowerCase().strip()) {
            case "oneplus":
                carrelloProdotti[carrelloProdotti.length - 1] = onePlus;
                System.out.println("Prodotto aggiunto alla tua lista");
            break;

            case "logitech":
            carrelloProdotti[carrelloProdotti.length - 1] = logitech;
            System.out.println("Prodotto aggiunto alla tua lista");
            break;

            case "samsung":
            carrelloProdotti[carrelloProdotti.length - 1] = samsung;
            System.out.println("Prodotto aggiunto alla tua lista");
            break;
        
            default:
                System.out.println("Nessun prodotto corrisponde a: " + inputInserito);
                break;
        }




        /* if (inputInserito.strip().toLowerCase().equals("oneplus".strip().toLowerCase())) {
            carrelloProdotti[carrelloProdotti.length -1] = onePlus;
            System.out.println("Prodotto aggiunto alla tua lista");
        } else if (inputInserito.strip().toLowerCase().equals("logitech".strip().toLowerCase())) {
            carrelloProdotti[carrelloProdotti.length - 1] = logitech;
        } else if (inputInserito.strip().toLowerCase().equals("samsung".strip().toLowerCase())) {
            carrelloProdotti[carrelloProdotti.length - 1] = samsung;
        } else {
            System.out.println("Nessun prodotto corrisponde a: " + inputInserito);
        } */

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
        
        System.out.println(carrello.getCarrello());

    }
}
