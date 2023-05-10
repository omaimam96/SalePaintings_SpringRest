package it.contrader.model;

import java.util.Date;

public class Acquisto {
    private int idOrdine;

    private Date dataOrdine;

    private double prezzo;

    private String quadro;

    private int idUser;

    public Acquisto(){

    };

    public Acquisto(int idOrdine, Date dataOrdine, double prezzo, String quadro, int idUser){
        setIdOrdine(idOrdine);
        setDataOrdine(dataOrdine);
        setPrezzo(prezzo);
        setQuadro(quadro);
        setIdUser(idUser);

    }

    public int getIdOrdine() {
        return idOrdine;
    }

    public void setIdOrdine(int idOrdine) {
        this.idOrdine = idOrdine;
    }

    public Date getDataOrdine() {
        return dataOrdine;
    }

    public void setDataOrdine(Date dataOrdine) {
        this.dataOrdine = dataOrdine;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getQuadro() {
        return quadro;
    }

    public void setQuadro(String quadro) {
        this.quadro = quadro;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
