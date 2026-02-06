package org.lessons.java.snacks;

public class Studente {
    private String nome;
    private String cognome;
    private int età;

    public Studente(String nome, String cognome, int età) {
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
    }

    public String getNomeEsteso() {
        return nome + " " + cognome + ", " + età + " anni";
    }
}
