package it.contrader.service;

import it.contrader.converter.UserConverter;
import it.contrader.dto.ProfiloDTO;
import it.contrader.model.Profilo;
import it.contrader.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfiloService extends AbstractService<Profilo, ProfiloDTO>{


    @Autowired
    private UserConverter userConverter;

    @Autowired
    private UserService userService;


    public ProfiloDTO insert(ProfiloDTO profiloDTO) {
        profiloDTO = new ProfiloDTO(profiloDTO.getId(),
                profiloDTO.getNome(),  profiloDTO.getCognome(),
                profiloDTO.getGenere(), profiloDTO.getEmail(),
                profiloDTO.getDataNascita(), profiloDTO.getNazione(),
                profiloDTO.getProvincia(), profiloDTO.getCittaResidenza(),
                profiloDTO.getIndirizzo(), profiloDTO.getUser());
        return converter.toDTO(repository.save(converter.toEntity(profiloDTO)));
    }

}
