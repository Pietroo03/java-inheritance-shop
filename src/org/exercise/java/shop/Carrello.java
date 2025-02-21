package org.exercise.java.shop;

import java.util.Scanner;

public class Carrello {

    protected Prodotto[] carrelloProdotti;
    
    public Carrello() {
        carrelloProdotti = new Prodotto[0];
    }

    public void aggiungiProdotto() {
        Scanner in = new Scanner(System.in);
        String inputInserito;
        String nomeInserito;
        float prezzoInserito;
        String memoriaInserita;
        boolean isWireless;
        String dimensioniInserite;
        boolean isSmart;

        do {

            System.out.print("Inserisci il tipo di prodotto (smartphone, cuffie, televisore): ");
            inputInserito = in.nextLine();

            Prodotto[] nuovoCarrelloProdotti = new Prodotto[carrelloProdotti.length + 1];

            for (int i = 0; i < carrelloProdotti.length; i++) {
                nuovoCarrelloProdotti[i] = carrelloProdotti[i];
            }

            carrelloProdotti = nuovoCarrelloProdotti;

            switch (inputInserito.toLowerCase().strip()) {
                case "smartphone":
                    System.out.print("Inserirsci il nome dello smartphone: ");
                    nomeInserito = in.nextLine();
                    System.out.print("Inserirsci il prezzo (123,00) dello smartphone: ");
                    prezzoInserito = in.nextFloat();
                    in.nextLine();
                    System.out.print("Inserirsci la memoria dello smartphone: ");
                    memoriaInserita = in.nextLine();
                    
                    Smartphone smartphoneCarrello = new Smartphone(nomeInserito, prezzoInserito, memoriaInserita);
                    carrelloProdotti[carrelloProdotti.length - 1] = smartphoneCarrello;
                    System.out.println("Smarthphone aggiunto alla tua lista");
                    break;

                case "cuffie":
                    System.out.print("Inserirsci il nome delle cuffie: ");
                    nomeInserito = in.nextLine();
                    System.out.print("Inserirsci il prezzo (123,00) delle cuffie: ");
                    prezzoInserito = in.nextFloat();
                    in.nextLine();
                    System.out.print("Le cuffie sono wireless?(true o false) ");
                    isWireless = in.nextBoolean();
                    in.nextLine();

                    Cuffie cuffieCarrello = new Cuffie(nomeInserito, prezzoInserito, isWireless);
                    carrelloProdotti[carrelloProdotti.length - 1] = cuffieCarrello;
                    System.out.println("Cuffie aggiunte alla tua lista");
                    break;

                case "televisore":
                    System.out.print("Inserirsci il nome del televisore: ");
                    nomeInserito = in.nextLine();
                    System.out.print("Inserirsci il prezzo (123,00) del televisore: ");
                    prezzoInserito = in.nextFloat();
                    in.nextLine();
                    System.out.print("Inserisci le dimensioni del televisore in pollici: ");
                    dimensioniInserite = in.nextLine();
                    System.out.print("Il televisore è smart?(true o false) ");
                    isSmart = in.nextBoolean();
                    in.nextLine();

                    Televisore televisoreCarrello = new Televisore(nomeInserito, prezzoInserito, dimensioniInserite, isSmart);
                    carrelloProdotti[carrelloProdotti.length - 1] = televisoreCarrello;
                    System.out.println("Televisore aggiunto alla tua lista");
                    break;

                default:
                    System.out.println("Nessun prodotto corrisponde a: " + inputInserito);
                    break;
            }

            System.out.println("Vuoi aggiungere un altro prodotto? (Si o No)");
            inputInserito = in.nextLine();

        } while (inputInserito.toLowerCase().strip().equals("si"));

        in.close();

    }

    public String getCarrello() {
        String risultato = "Prodotti nel carrello: \n";
        float prezzoTotale = 0;

        for (int i = 0; i < carrelloProdotti.length; i++) {
            if (carrelloProdotti[i] != null) { 
                risultato += carrelloProdotti[i].toString() + "\n";
                prezzoTotale += carrelloProdotti[i].getPrezzoConIva();
            }
        }

        risultato += "Totale: " + prezzoTotale;
        return risultato;
    }

    public static void main(String[] args) {

        Carrello carrello = new Carrello();

        carrello.aggiungiProdotto();
        
        System.out.println(carrello.getCarrello());

    }
}
