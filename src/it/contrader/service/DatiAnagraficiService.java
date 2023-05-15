package it.contrader.service;

import it.contrader.converter.DatiAnagraficiConverter;
import it.contrader.dao.DatiAnagraficiDAO;
import it.contrader.dto.DatiAnagraficiDTO;
import it.contrader.dto.UserDTO;
import it.contrader.model.DatiAnagrafici;

import java.util.List;

public class DatiAnagraficiService {

    private DatiAnagraficiDAO datiAnagraficiDAO;
    private DatiAnagraficiConverter datiAnagraficiConverter;

    public DatiAnagraficiService(){
        this.datiAnagraficiDAO= new DatiAnagraficiDAO();
        this.datiAnagraficiConverter= new DatiAnagraficiConverter();

    }
    public List<DatiAnagraficiDTO> getAll() {
        // Ottiene una lista di entità e le restituisce convertendole in DTO
        return datiAnagraficiConverter.toDTOList(datiAnagraficiDAO.getAll());
    }


    public DatiAnagraficiDTO read(int id) {
        // Ottiene un'entità e la restituisce convertendola in DTO
        return datiAnagraficiConverter.toDTO(datiAnagraficiDAO.read(id));
    }


    public boolean insert(DatiAnagraficiDTO dto) {
        // Converte un DTO in entità e lo passa al DAO per l'inserimento
        return datiAnagraficiDAO.insert(datiAnagraficiConverter.toEntity(dto));
    }


    public boolean update(DatiAnagraficiDTO dto) {
        // Converte un userDTO in entità e lo passa allo userDAO per la modifica
        return datiAnagraficiDAO.update(datiAnagraficiConverter.toEntity(dto));
    }
}
