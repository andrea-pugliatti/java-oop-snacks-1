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

    public void setNumeroConto(int numero) {
        this.numeroConto = numero;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void deposita(BigDecimal somma) {
        if (somma.signum() == 1) {
            this.saldo = this.saldo.add(somma);
        }
    }

    public boolean ritira(BigDecimal somma) {
        if (somma.signum() == 1 && this.saldo.compareTo(somma) == 1) {
            this.saldo = this.saldo.subtract(somma);
            return true;
        }
        return false;
    }
}
