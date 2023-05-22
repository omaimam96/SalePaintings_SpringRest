package it.contrader.view;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;

public class SignUpView extends AbstractView {

    private String username;

    private String password;

    private String usertype;

    private final String mode = "INSERT";

    public void showResults(Request request) {

    }
    /**
     * chiede in input all'utente uno username e una password usando il metodo getInput() presente in AbstractView
     */
    public void showOptions() {

        System.out.println("----- .:REGISTER:. ----");

        System.out.println("[A]dmin [U]ser");
        this.usertype = getInput();

        System.out.println(" Nome utente:");
        this.username = getInput();

        System.out.println(" Password:");
        this.password = getInput();
    }

    /**
     * Impacchetta una request (metodo request.put("chiave", valore)) e la manda al controller Home tramite il Dispatcher
     */
    public void submit() {

        Request request = new Request();

        if(usertype.equals("a")){
            usertype="ADMIN";
        } else  {
            usertype="USER";
        }

        request.put("usertype", usertype);
        request.put("username", username);
        request.put("password", password);
        request.put("mode", mode);

        MainDispatcher.getInstance().callAction("User", "doControl", request);
    }


}
