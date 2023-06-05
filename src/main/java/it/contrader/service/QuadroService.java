package it.contrader.service;

import it.contrader.dao.QuadroRepository;
import it.contrader.dto.QuadroDTO;
import it.contrader.model.Quadro;
import org.springframework.stereotype.Service;



@Service
public class QuadroService extends AbstractService<Quadro, QuadroDTO> {

    //ALL crud methods in AbstractService

    //LOGIN method
    public QuadroDTO findById(long id) {
        return converter.toDTO(((QuadroRepository)repository).findById(id));
    }

}