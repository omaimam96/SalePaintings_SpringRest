package it.contrader.service;

import it.contrader.dao.ProfiloRepository;
import it.contrader.dao.UserRepository;
import it.contrader.dto.ProfiloDTO;
import it.contrader.dto.UserDTO;
import it.contrader.model.Profilo;
import org.springframework.stereotype.Service;

@Service
public class ProfiloService extends AbstractService<Profilo, ProfiloDTO>{

    public ProfiloDTO findById (long id){
        return converter.toDTO(((ProfiloRepository)repository).findById(id));
    }


}
