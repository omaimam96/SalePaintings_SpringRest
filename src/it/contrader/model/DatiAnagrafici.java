package it.contrader.model;

import java.util.Date;
import java.util.Objects;

public class DatiAnagrafici {
    private int id;
    private String nome;
    private String cognome;
    private String genere;
    private Date datadinascita;
    private String nazione;
    private String provincia;
    private String cittaResidenza;
    private String indirizzo;

    public DatiAnagrafici(){

    };
    public DatiAnagrafici(String nome, String cognome, String genere, Date datadinascita, String nazione, String provincia,
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

    public DatiAnagrafici(int id, String nome, String cognome, String genere, Date datadinascita, String nazione, String provincia, String cittaResidenza, String indirizzo) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.genere = genere;
        this.datadinascita = datadinascita;
        this.nazione = nazione;
        this.provincia = provincia;
        this.cittaResidenza = cittaResidenza;
        this.indirizzo = indirizzo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
        return  id+"\t"+nome + "\t"  + cognome +"\t\t" +  genere  + "\t\t" + datadinascita + "\t\t" + nazione+ "\t\t" +
                provincia+ "\t\t" +cittaResidenza+ "\t\t" +indirizzo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DatiAnagrafici that = (DatiAnagrafici) o;
        return id == that.id && Objects.equals(nome, that.nome) && Objects.equals(cognome, that.cognome) && Objects.equals(genere, that.genere) && Objects.equals(datadinascita, that.datadinascita) && Objects.equals(nazione, that.nazione) && Objects.equals(provincia, that.provincia) && Objects.equals(cittaResidenza, that.cittaResidenza) && Objects.equals(indirizzo, that.indirizzo);
    }


}
