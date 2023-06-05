package it.contrader.service;

import it.contrader.dao.QuadroRepository;
import it.contrader.dto.QuadroDTO;
import it.contrader.model.Quadro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class QuadroService extends AbstractService<Quadro, QuadroDTO> {

    //ALL crud methods in AbstractService
    public QuadroDTO insert(QuadroDTO quadroDTO){
        quadroDTO=new QuadroDTO(quadroDTO.getId(),quadroDTO.getNomeQuadro(),quadroDTO.getTipologia(),quadroDTO.getCosto(),quadroDTO.getOrientamento(),quadroDTO.getDescrizione(),quadroDTO.getProfilo(),quadroDTO.isVenduto());
        return converter.toDTO(repository.save(converter.toEntity(quadroDTO)));
    }
    public QuadroDTO update(QuadroDTO quadroDTO){
        quadroDTO=new QuadroDTO(quadroDTO.getId(),quadroDTO.getNomeQuadro(),quadroDTO.getTipologia(),quadroDTO.getCosto(),quadroDTO.getOrientamento(),quadroDTO.getDescrizione(),quadroDTO.getProfilo(),quadroDTO.isVenduto());
        return converter.toDTO(repository.save(converter.toEntity(quadroDTO)));
    }
}