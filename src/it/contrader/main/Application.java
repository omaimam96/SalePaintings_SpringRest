package it.contrader.main;

import java.util.Scanner;

/*
 * Ogni applicazione java necessita di una funzione main() 
 * Essa sar� di fatto la prima funzione chiamata dalla JVM, la sua mancanza verr� infatti notata dall'interprete che 
 * quindi non permetter� l'avvio del programma.
 * Banalmente qualsiasi applicazione a cascata ( stile C ) potrebbe essere interamente scritta all'interno del main
 * ma questo non avrebbe senso all'interno di un linguaggio di programmazione ad oggetti.
 * Per ulteriori dettagli GUIDA SEZIONE 1.
*/
public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\t\tSALEPAINTINGS\n" +
                "\t[1] LOGIN\n" +
                "\t[2] SIGNUP\n" +
                "\t[X] EXIT");

        String select = sc.next();

        switch (select){
            case "1":
                MainDispatcher.getInstance().callAction("Login", "doControl", null);
                break;
            case "2":
                MainDispatcher.getInstance().callAction("Register", "doControl", null);
                break;

            default:
                return;
        };





    }

}
