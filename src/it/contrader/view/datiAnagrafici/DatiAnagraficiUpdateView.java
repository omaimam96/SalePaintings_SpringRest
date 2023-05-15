package it.contrader.view.datiAnagrafici;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class DatiAnagraficiUpdateView extends AbstractView {
    private Request request;
    private String nome;
    private String cognome;
    private String genere;
    private String datadinascita;
    private String nazione;
    private String provincia;
    private String cittaResidenza;
    private String indirizzo;
    private final String mode = "UPDATE";
    public DatiAnagraficiUpdateView(){

    }
    @Override
    public void showResults(Request request) {
        if (request!=null) {
            System.out.println("Modifica andata a buon fine.\n");
            MainDispatcher.getInstance().callView("DatiAnagrafici", null);

    }

    }

    @Override
    public void showOptions() {
        try {
            System.out.println("Inserisci nome dell'utente:");
            nome = getInput();
            System.out.println("Inserisci cognome dell'utente:");
            cognome = getInput();
            System.out.println("Inserisci genere dell'utente:");
            genere = getInput();
            System.out.println("Inserisci data di nascita dell'utente:");
            datadinascita = getInput();
            System.out.println("Inserisci nazione dell'utente:");
            nazione = getInput();
            System.out.println("Inserisci provincia dell'utente:");
            provincia = getInput();
            System.out.println("Inserisci città di residenza dell'utente:");
            cittaResidenza = getInput();
            System.out.println("Inserisci indirizzo dell'utente:");
            indirizzo = getInput();
        } catch (Exception e) {

        }

    }

    @Override
    public void submit() {
        request = new Request();
        request.put("nome", nome);
        request.put("cognome", cognome);
        request.put("genere", genere);
        request.put("datadinascita", datadinascita);
        request.put("nazione", nazione);
        request.put("provincia", provincia);
        request.put("cittaResidenza", cittaResidenza);
        request.put("indirizzo", indirizzo);
        request.put("register","false");
        MainDispatcher.getInstance().callAction("DatiAnagrafici", "doControl", request);

    }
}
