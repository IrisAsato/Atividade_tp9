package Compromisso;

import Gerente.Gerente;

import java.util.Date;

public class Compromisso {
    private int numeroCompromisso;
    private Date dataCompromisso;
    private String horaCompromisso;
    private String descricao;
    private Gerente gerente;

    // Getters
    public int getNumeroCompromisso() {
        return this.numeroCompromisso;
    }

    public Date getDataCompromisso() {
        return this.dataCompromisso;
    }

    public String getHoraCompromisso() {
        return this.horaCompromisso;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public Gerente getGerente() {
        return this.gerente;
    }

    // Setters
    public void setNumeroCompromisso(int numeroCompromisso) {
        this.numeroCompromisso = numeroCompromisso;
    }

    public void setDataCompromisso(Date dataCompromisso) {
        this.dataCompromisso = dataCompromisso;
    }

    public void setHoraCompromisso(String horaCompromisso) {
        this.horaCompromisso = horaCompromisso;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public void agendarCompromisso() {
        System.out.println("Compromisso agendado para o gerente " + this.gerente.getNome() + " na data " + this.dataCompromisso + " às " + this.horaCompromisso);
    }

    public void cancelarCompromisso() {
        System.out.println("Compromisso cancelado para o gerente " + this.gerente.getNome());
    }
}
