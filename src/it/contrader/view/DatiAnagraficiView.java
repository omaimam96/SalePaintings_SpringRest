package it.contrader.view;

import it.contrader.controller.Request;
import it.contrader.dto.DatiAnagraficiDTO;
import it.contrader.main.MainDispatcher;

import java.util.List;

public class DatiAnagraficiView extends AbstractView{

    private Request request;
    private String choice;
    public DatiAnagraficiView(){

    }

    @Override
    public void showResults(Request request) {
        if (request != null){
            System.out.println("\n------------------- Profilo utente ----------------\n");
            System.out.println("Nome\tCognome\tGenere\tData di nascita\tNazionalità\tProvincia\tResidenza" +
                    "\tIndirizzo");
            System.out.println("----------------------------------------------------\n");
            @SuppressWarnings("unchecked")
            List<DatiAnagraficiDTO> datianagraficiS =(List<DatiAnagraficiDTO>) request.get("datianagraficiS");
            for (DatiAnagraficiDTO d:datianagraficiS) {
                System.out.println(d);
                System.out.println();

            }
        }

    }

    @Override
    public void showOptions() {
        System.out.println("          Scegli l'operazione da effettuare:");
        System.out.println("[L]eggi [I]nserisci [M]odifica [B]ack [E]sci");

        this.choice = getInput();



    }

    @Override
    public void submit() {
        request = new Request();
        request.put("choice", choice);
        request.put("mode", "GETCHOICE");
        MainDispatcher.getInstance().callAction("DatiAnagrafici", "doControl", this.request);



    }
}
