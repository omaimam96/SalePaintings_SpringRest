package it.contrader.dto;

import java.util.Date;

public class DatiAnagraficiDTO {

    private int id;
    private String nome;
    private String cognome;
    private String genere;
    private Date datadinascita;
    private String nazione;
    private String provincia;
    private String cittaResidenza;
    private String indirizzo;

    public DatiAnagraficiDTO(){

    }
    public DatiAnagraficiDTO(String nome, String cognome,String genere, Date datadinascita,
                             String nazione,String provincia,String cittaResidenza, String indirizzo){
        this.nome= nome;
        this.cognome= cognome;
        this.genere= genere;
        this.datadinascita=datadinascita;
        this.nazione= nazione;
        this.provincia= provincia;
        this.cittaResidenza= cittaResidenza;
        this.indirizzo= indirizzo;


    }
    public DatiAnagraficiDTO(int id,String nome, String cognome,String genere, Date datadinascita,
                             String nazione,String provincia,String cittaResidenza, String indirizzo){
        this.id= id;
        this.nome= nome;
        this.cognome= cognome;
        this.genere= genere;
        this.datadinascita= datadinascita;
        this.nazione= nazione;
        this.provincia= provincia;
        this.cittaResidenza= cittaResidenza;
        this.indirizzo= indirizzo;


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
}
