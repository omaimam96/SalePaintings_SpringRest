package it.contrader.model;

import java.util.Date;

public class datiAnagrafici {
    private String nome;
    private String cognome;
    private String genere;
    private Date datadinascita;
    private String nazione;
    private String provincia;
    private String cittaResidenza;
    private String indirizzo;

    public datiAnagrafici(){

    };
    public datiAnagrafici(String nome, String cognome, String genere, Date datadinascita, String nazione, String provincia,
                          String cittaResidenza, String indirizzo){
        setNome(nome);
        setCognome(cognome);
        setGenere(genere);
        setDatadinascita(datadinascita);
        setNazione(nazione);
        setProvincia(provincia);
        setCittaResidenza(cittaResidenza);
        setIndirizzo(indirizzo);
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public Date getDatadinascita() {
        return datadinascita;
    }

    public void setDatadinascita(Date datadinascita) {
        this.datadinascita = datadinascita;
    }

    public String getNazione() {
        return nazione;
    }

    public void setNazione(String nazione) {
        this.nazione = nazione;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCittaResidenza() {
        return cittaResidenza;
    }

    public void setCittaResidenza(String cittaResidenza) {
        this.cittaResidenza = cittaResidenza;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
