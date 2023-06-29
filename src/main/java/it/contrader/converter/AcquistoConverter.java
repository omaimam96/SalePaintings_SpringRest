package it.contrader.converter;

import it.contrader.dto.AcquistoDTO;
import it.contrader.model.Acquisto;
import org.springframework.stereotype.Component;


@Component
public class AcquistoConverter extends AbstractConverter<Acquisto, AcquistoDTO> {
    @Override
    public Acquisto toEntity(AcquistoDTO acquistoDTO) {
        Acquisto acquisto = null;
        if(acquistoDTO != null){
            acquisto = new Acquisto(acquistoDTO.getId(), acquistoDTO.getDataOrdine(),acquistoDTO.getCodiceAcquisto(),acquistoDTO.getProfilo());
        }
        return acquisto;
    }

    @Override
    public AcquistoDTO toDTO(Acquisto acquisto) {
        AcquistoDTO acquistoDTO = null;
        if(acquisto !=null){
            acquistoDTO = new AcquistoDTO(acquisto.getId(), acquisto.getDataOrdine(),acquisto.getCodiceAcquisto(),acquisto.getProfilo());
        }
        return acquistoDTO;
    }
}