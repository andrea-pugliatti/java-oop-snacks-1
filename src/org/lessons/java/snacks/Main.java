package org.lessons.java.snacks;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Studente anselmo = new Studente("Anselmo", "Bitta", 24);
        System.out.println(anselmo.getNomeEsteso());

        ContoBancario conto = new ContoBancario(32131);
        conto.deposita(new BigDecimal(200));
        conto.deposita(new BigDecimal(100));
        conto.deposita(new BigDecimal(50));
        conto.ritira(new BigDecimal(150));
        System.out.println(conto.getSaldo());
    }
}
