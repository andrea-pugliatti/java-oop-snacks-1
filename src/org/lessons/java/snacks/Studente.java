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

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEtà() {
        return this.età;
    }

    public void setEtà(int età) {
        this.età = età;
    }

    public String getNomeEsteso() {
        return String.format("%s %s, %d", nome, cognome, età);
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d", nome, cognome, età);
    }
}
