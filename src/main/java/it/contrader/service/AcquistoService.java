package it.contrader.service;

import it.contrader.dto.QuadroDTO;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import it.contrader.converter.AcquistoConverter;
import it.contrader.dao.AcquistoRepository;
import it.contrader.dto.AcquistoDTO;
import it.contrader.model.Acquisto;

import java.util.List;

@Service
public class AcquistoService extends AbstractService<Acquisto, AcquistoDTO> {

    @Autowired
    private AcquistoConverter converter;

    @Autowired
    private AcquistoRepository repository;
    public AcquistoDTO insert(AcquistoDTO acquistoDTO){
        acquistoDTO=new AcquistoDTO(acquistoDTO.getId(),acquistoDTO.getDataOrdine()
                ,acquistoDTO.getCodiceAcquisto(),acquistoDTO.getProfilo());
        return converter.toDTO(repository.save(converter.toEntity(acquistoDTO)));
    }

    public List<Acquisto> findAcquisti(long userId){return repository.findByAcquisto(userId);}
}