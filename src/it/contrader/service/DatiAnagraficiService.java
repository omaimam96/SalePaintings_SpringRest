package it.contrader.service;

import it.contrader.converter.DatiAnagraficiConverter;
import it.contrader.dto.DatiAnagraficiDTO;

import java.util.List;

public class DatiAnagraficiService {

    private DatiAnagraficiDTO datiAnagraficiDTO;
    private DatiAnagraficiConverter datiAnagraficiConverter;

    public DatiAnagraficiService(){
        this.datiAnagraficiDTO= new DatiAnagraficiDTO();
        this.datiAnagraficiConverter= new DatiAnagraficiConverter();

    }
}
