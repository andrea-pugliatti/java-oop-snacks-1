package org.lessons.java.snacks;

import java.math.BigDecimal;

public class ContoBancario {
    private int numeroConto;
    private BigDecimal saldo;

    public ContoBancario(int numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = new BigDecimal(0);
    }

    public int getNumeroConto() {
        return this.numeroConto;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public void deposita(BigDecimal somma) {
        if (somma.signum() == 1) {
            this.saldo = this.saldo.add(somma);
        }
    }

    public void ritira(BigDecimal somma) {
        if (somma.signum() == 1) {
            this.saldo = this.saldo.subtract(somma);
        }
    }
}
