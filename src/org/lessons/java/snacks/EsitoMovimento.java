package org.lessons.java.snacks;

import java.math.BigDecimal;

public class EsitoMovimento {
    private final boolean esito;
    private final BigDecimal sommaSpostata;

    public EsitoMovimento(boolean esito, BigDecimal sommaSpostata) {
        this.esito = esito;
        this.sommaSpostata = sommaSpostata;
    }

    public boolean getEsito() {
        return this.esito;
    }

    public BigDecimal getSommaPrelevata() {
        return this.sommaSpostata;
    }

    @Override
    public String toString() {
        return "Esito: " + this.esito + " | Somma spostata: " + this.sommaSpostata;
    }
}
