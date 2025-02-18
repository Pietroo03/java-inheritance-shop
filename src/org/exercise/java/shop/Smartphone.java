// Caratterizzati anche dal codice IMEI e dalla quantità di memoria

package org.exercise.java.shop;

import java.util.Random;

public class Smartphone extends Prodotto {

    protected String codiceImei;
    protected String memoria;

    public Smartphone(String nome, String descrizione, float prezzo, String memoria) {
        super(nome, descrizione, prezzo);
        this.codiceImei = generateImei();
        this.memoria = memoria;
    }

    private String generateImei() {
        Random rand = new Random();
        StringBuilder imeiBuilder = new StringBuilder();

        for (int i = 0; i < 15; i++) {
            imeiBuilder.append(rand.nextInt(10));
        }
        return imeiBuilder.toString();
    }

    public String getCodiceImei() {
        return this.codiceImei;
    }

    public String getMemoria() {
        return this.memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }
}
