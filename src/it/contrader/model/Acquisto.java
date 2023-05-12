package it.contrader.model;

import java.util.Date;
import java.util.Objects;

public class Acquisto {
    private int idOrdine;

    private Date dataOrdine;

    private double prezzo;

    private String quadro;

    private int idUser;

    public Acquisto(){

    };

    public Acquisto(Date dataOrdine, double prezzo, String quadro, int idUser) {
        this.dataOrdine = dataOrdine;
        this.prezzo = prezzo;
        this.quadro = quadro;
        this.idUser = idUser;
    }

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
            return  idOrdine + "\t"  + dataOrdine +"\t\t" +   prezzo + "\t\t" + quadro+ "\t\t"+idUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Acquisto acquisto = (Acquisto) o;
        return idOrdine == acquisto.idOrdine && Double.compare(acquisto.prezzo, prezzo) == 0 && idUser == acquisto.idUser && Objects.equals(dataOrdine, acquisto.dataOrdine) && Objects.equals(quadro, acquisto.quadro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOrdine, dataOrdine, prezzo, quadro, idUser);
    }
}
