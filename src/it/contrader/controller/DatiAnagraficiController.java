package it.contrader.controller;

import it.contrader.dto.DatiAnagraficiDTO;
import it.contrader.main.MainDispatcher;
import it.contrader.service.DatiAnagraficiService;

import java.util.Date;
import java.util.List;

public class DatiAnagraficiController implements Controller{

    private static String sub_package= "datianagrafici.";
    private DatiAnagraficiService datiAnagraficiService;
    public DatiAnagraficiController(){
        this.datiAnagraficiService= new DatiAnagraficiService();
    }

    @Override
    public void doControl(Request request) {

        String mode = (String) request.get("mode");

        String choice = (String) request.get("choice");

        int id;
        String nome;
        String cognome;
        String genere;
        Date datadinascita;
        String nazione;
        String provincia;
        String cittaResidenza;
        String indirizzo;
        String register;
        int user;

        switch (mode){

            case "READ":
                user = Integer.parseInt(request.get("user").toString());
                DatiAnagraficiDTO datiAnagraficiDTO=datiAnagraficiService.read(user);
                request.put("datianagrafici",datiAnagraficiDTO);
                MainDispatcher.getInstance().callView(sub_package + "DatiAnagraficiRead", request);
                break;
            case "INSERT":
                nome=request.get("nome").toString();
                cognome=request.get("cognome").toString();
                genere=request.get("genere").toString();
                datadinascita= ( (Date) request.get("dataNascita"));
                nazione=request.get("nazione").toString();
                provincia=request.get("provincia").toString();
                cittaResidenza=request.get("cittaResidenza").toString();
                indirizzo=request.get("indirizzo").toString();
                register=request.get("register").toString();
                DatiAnagraficiDTO datianagraficitoinsert = new DatiAnagraficiDTO(nome,cognome,genere,datadinascita,nazione,
                        provincia,cittaResidenza,indirizzo);
                datiAnagraficiService.insert(datianagraficitoinsert);
                request = new Request();
                request.put("register", register);
                MainDispatcher.getInstance().callView(sub_package + "DatiAnagraficiInsert", request);
                break;
            case "UPDATE":
                user = Integer.parseInt(request.get("user").toString());
                nome=request.get("nome").toString();
                cognome=request.get("cognome").toString();
                genere=request.get("genere").toString();
                datadinascita= ( (Date) request.get("dataNascita"));
                nazione=request.get("nazione").toString();
                provincia=request.get("provincia").toString();
                cittaResidenza=request.get("cittaResidenza").toString();
                indirizzo=request.get("indirizzo").toString();
                register=request.get("register").toString();
                DatiAnagraficiDTO datianagraficitoupdate = new DatiAnagraficiDTO(nome,cognome,genere,datadinascita,nazione,
                        provincia,cittaResidenza,indirizzo);
                datiAnagraficiService.insert(datianagraficitoupdate);
                datianagraficitoupdate.setId(user);
                request = new Request();
                request.put("mode", "mode");
                MainDispatcher.getInstance().callView(sub_package + "DatiAnagraficiUpdate", request);
                break;
            case "PROFILO":
                List<DatiAnagraficiDTO> datiAnagraficiDTOS = datiAnagraficiService.getAll();
                //Impacchetta la request con la lista degli user
                request.put("datianagraficiS", datiAnagraficiDTOS);
                MainDispatcher.getInstance().callView("DatiAnagrafici", request);
                break;
            case "GETCHOICE":

                //toUpperCase() mette in maiuscolo la scelta
                switch (choice.toUpperCase()) {

                    case "L":
                        MainDispatcher.getInstance().callView(sub_package + "DatiAnagraficiRead", null);
                        break;

                    case "I":
                        MainDispatcher.getInstance().callView(sub_package + "DatiAnagraficiInsert", null);
                        break;

                    case "M":
                        MainDispatcher.getInstance().callView(sub_package + "DatiAnagraficiUpdate", null);
                        break;

                    case "E":
                        MainDispatcher.getInstance().callView("Login", null);
                        break;

                    case "B":
                        MainDispatcher.getInstance().callView("HomeAdmin", null);
                        break;

                    default:
                        MainDispatcher.getInstance().callView("Login", null);
                }

            default:
                MainDispatcher.getInstance().callView("Login", null);
        }

        }

    }

