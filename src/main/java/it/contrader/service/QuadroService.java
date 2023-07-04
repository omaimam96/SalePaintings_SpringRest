package it.contrader.service;

import it.contrader.dao.ProfiloRepository;
import it.contrader.dao.QuadroRepository;
import it.contrader.dto.QuadroDTO;
import it.contrader.model.Profilo;
import it.contrader.model.Quadro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class QuadroService extends AbstractService<Quadro, QuadroDTO> {

    @Autowired
    private QuadroRepository QRepository;


    //ALL crud methods in AbstractService
    public QuadroDTO insert(QuadroDTO quadroDTO) {
        quadroDTO = new QuadroDTO(quadroDTO.getId(), quadroDTO.getNomeQuadro()
                , quadroDTO.getTipologia(), quadroDTO.getCosto()
                , quadroDTO.getOrientamento(), quadroDTO.getDescrizione()
                , quadroDTO.getProfilo(), quadroDTO.isVenduto()
                , quadroDTO.getCodiceProdotto(), quadroDTO.getAcquisto());
        return converter.toDTO(repository.save(converter.toEntity(quadroDTO)));
    }

    public List<Quadro> readByDisp() {
        return QRepository.readByDisp();
    }

    public List<Quadro> getAllByFilter(String tipologia, String orientamento, String ricerca, String ordine) {
        return QRepository.getAllByFilter(tipologia, orientamento, ricerca, ordine);
    }
    public List<Quadro> readByAcquistoId(long acquistoId){
        return QRepository.findByAcquistoId(acquistoId);
}
}