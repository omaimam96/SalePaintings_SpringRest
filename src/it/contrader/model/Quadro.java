package it.contrader.model;

public class Quadro {
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
        return  nome + "\t"  + tipologia +"\t\t" +   costo + "\t\t" + orientamento+ "\t\t" + descrizione;
    }
}
