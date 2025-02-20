// Caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no

package org.exercise.java.shop;

public class Televisore extends Prodotto {

    protected String dimensioni;
    protected boolean smart;

    public Televisore(String nome, String descrizione, float prezzo, String dimensioni, boolean smart) {
        super(nome, descrizione, prezzo);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    public Televisore(String nome, float prezzo, String dimensioni, boolean smart) {
        super(nome, prezzo);
        this. dimensioni = dimensioni;
        this.smart = smart;
    }

    public String getDimensioni() {
        return this.dimensioni;
    }

    public void setDimensioni(String dimensioni) {
        this.dimensioni = dimensioni;
    }

    public boolean getSmart() {
        return this.smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
}
