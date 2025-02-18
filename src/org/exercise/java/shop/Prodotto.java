package org.exercise.java.shop;

import java.util.Random;

public class Prodotto {

    private int codice;
    private String nome;
    private String descrizione;
    private float prezzo;
    private static int iva = 22;

    public Prodotto(String nome, String descrizione, float prezzo) {
        Random rand = new Random();
        this.codice = rand.nextInt(999999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public Prodotto() {
        Random rand = new Random();
        this.codice = rand.nextInt(999999);
        this.nome = "";
        this.descrizione = "";
        this.prezzo = 0.0f;
    }

    public int getCodice() {
        return this.codice;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public float getPrezzoBase() {
        return this.prezzo;
    }

    public void setPrezzoBase(float prezzo) {
        this.prezzo = prezzo;
    }

    public static int getIva() {
        return iva;
    }

    public static void setIva(int nuovaIva) {
        iva = nuovaIva;
    }

    public float getPrezzoConIva() {
        float prezzoConIva = prezzo + (prezzo / 100 * iva);
        return Math.round(prezzoConIva * 100) / 100.0f;
    }

    public String getNomeEsteso() {
        String nomeEsteso = Integer.toString(codice) + " - " + nome;
        return nomeEsteso;
    }
}