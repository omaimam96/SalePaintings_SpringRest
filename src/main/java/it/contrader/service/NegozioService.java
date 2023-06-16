package it.contrader.service;

import it.contrader.dao.NegozioRepository;
import it.contrader.dto.NegozioDTO;
import it.contrader.model.Negozio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NegozioService extends AbstractService<Negozio, NegozioDTO >{
    @Autowired
    NegozioRepository negozioRepository;
    public Negozio readByUserId(long userId){
        return negozioRepository.findByUserId(userId);
    }
    public NegozioDTO insert(NegozioDTO negozioDTO){
        return converter.toDTO(negozioRepository.save(converter.toEntity(negozioDTO)));
    }
    public NegozioDTO update(NegozioDTO negozioDTO){
        negozioDTO= new NegozioDTO(negozioDTO.getId(), negozioDTO.getNomeNegozio(),
                negozioDTO.getIndirizzoNegozio(), negozioDTO.getProvinciaNegozio(),
                negozioDTO.getNazioneNegozio(),negozioDTO.getDescrizioneNegozio(),
                negozioDTO.getCittaResidenzaNegozio(), negozioDTO.getUser());
        return converter.toDTO(negozioRepository.save(converter.toEntity(negozioDTO)));
    }

}
