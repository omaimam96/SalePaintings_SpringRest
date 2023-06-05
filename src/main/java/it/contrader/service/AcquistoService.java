package it.contrader.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import it.contrader.converter.AcquistoConverter;
import it.contrader.dao.AcquistoRepository;
import it.contrader.dto.AcquistoDTO;
import it.contrader.model.Acquisto;

@Service
public class AcquistoService extends AbstractService<Acquisto, AcquistoDTO> {

    @Autowired
    private AcquistoConverter converter;

    @Autowired
    private AcquistoRepository repository;

}