package it.contrader.view.datiAnagrafici;

import it.contrader.controller.Request;
import it.contrader.dto.DatiAnagraficiDTO;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class DatiAnagraficiReadView extends AbstractView {

    private  int user;
    private Request request;
    private final String mode= "READ";

    public DatiAnagraficiReadView(){

    }
    @Override
    public void showResults(Request request) {
        if (request!=null){
            DatiAnagraficiDTO datianagrafici=(DatiAnagraficiDTO) request.get("datianagrafici");
            System.out.println(datianagrafici);
            MainDispatcher.getInstance().callView("DatiAnagrafici",null);
        }

    }

    @Override
    public void showOptions() {
        System.out.println("Inserisci l'ID dell'utente:");
        user = Integer.parseInt(getInput());

    }

    @Override
    public void submit() {
        request = new Request();
        request.put("user", user);
        request.put("mode", mode);
        MainDispatcher.getInstance().callAction("DatiAnagrafici", "doControl", request);

    }
}
