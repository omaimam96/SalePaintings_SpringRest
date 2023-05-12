package it.contrader.controller;

import it.contrader.main.MainDispatcher;

public class SignUpController implements Controller {
    public SignUpController() {
    }

    public void doControl (Request request) {
        /**
         * Attraverso il Dispatcher va alla pagina di registrazione
         */
        MainDispatcher.getInstance().callView("Register", request);
    }

}
