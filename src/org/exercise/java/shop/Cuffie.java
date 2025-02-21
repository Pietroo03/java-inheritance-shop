// Caratterizzate dal colore e se sono wireless o cablate

package org.exercise.java.shop;

public class Cuffie extends Prodotto {

    protected String colore;
    protected boolean wireless;

    public Cuffie(String nome, String descrizione, float prezzo, String colore, boolean wireless) {
        super(nome, descrizione, prezzo);
        this.colore = colore;
        this.wireless = wireless;
    }

    public Cuffie(String nome, float prezzo, boolean wireless) {
        super(nome, prezzo);
        this.wireless = wireless;
    }

    public String getColore() {
        return this.colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean getWireless() {
        return this.wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

}
