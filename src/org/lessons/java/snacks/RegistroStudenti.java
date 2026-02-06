package org.lessons.java.snacks;

public class RegistroStudenti {
    private Studente[] registro;

    public RegistroStudenti() {
        this.registro = new Studente[0];
    }

    public Studente[] getRegistro() {
        return this.registro;
    }

    public void setRegistro(Studente[] registro) {
        this.registro = registro;
    }

    public void aggiungiStudente(Studente studente) {
        Studente[] nuovoRegistro = new Studente[this.registro.length + 1];

        for (int i = 0; i < this.registro.length; i++) {
            nuovoRegistro[i] = this.registro[i];
        }

        nuovoRegistro[nuovoRegistro.length - 1] = studente;
        this.registro = nuovoRegistro;
    }

    @Override
    public String toString() {
        String out = "Registro studenti:";
        for (Studente studente : registro) {
            out += String.format(" %s;", studente);
        }
        return out;
    }
}
