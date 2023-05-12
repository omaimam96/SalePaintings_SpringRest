package it.contrader.model;

import java.util.Objects;

public class Quadro {
    private int id;
    private String nome;
    private String tipologia;
    private double costo;
    private String orientamento;
    private String descrizione;

    public Quadro() {
    }

    public Quadro(String nome, String tipologia, double costo, String orientamento, String descrizione) {
        this.nome = nome;
        this.tipologia = tipologia;
        this.costo = costo;
        this.orientamento = orientamento;
        this.descrizione = descrizione;
    }

    public Quadro(int id, String nome, String tipologia, double costo, String orientamento, String descrizione) {
        this.id = id;
        this.nome = nome;
        this.tipologia = tipologia;
        this.costo = costo;
        this.orientamento = orientamento;
        this.descrizione = descrizione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getOrientamento() {
        return orientamento;
    }

    public void setOrientamento(String orientamento) {
        this.orientamento = orientamento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return nome + "\t" + tipologia + "\t\t" + costo + "\t\t" + orientamento + "\t\t" + descrizione;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quadro quadro = (Quadro) o;
        return id == quadro.id &&
                Double.compare(quadro.costo, costo) == 0 &&
                Objects.equals(nome, quadro.nome) &&
                Objects.equals(tipologia, quadro.tipologia) &&
                Objects.equals(orientamento, quadro.orientamento) &&
                Objects.equals(descrizione, quadro.descrizione);
    }


}
