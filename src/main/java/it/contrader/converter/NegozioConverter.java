package it.contrader.converter;

import it.contrader.dto.NegozioDTO;
import it.contrader.model.Negozio;
import org.springframework.stereotype.Component;

@Component
public class NegozioConverter extends AbstractConverter<Negozio, NegozioDTO>{

    @Override
    public Negozio toEntity(NegozioDTO negozioDTO) {
        Negozio negozio = null;
        if (negozioDTO != null) {
            negozio = new Negozio(negozioDTO.getId(), negozioDTO.getNomeNegozio(),
                    negozioDTO.getIndirizzoNegozio(), negozioDTO.getProvinciaNegozio(),
                    negozioDTO.getNazioneNegozio(),negozioDTO.getDescrizioneNegozio(),
                    negozioDTO.getCittaResidenzaNegozio(),negozioDTO.getUser());

        }
        return negozio;
    }

    @Override
    public NegozioDTO toDTO(Negozio negozio) {
            NegozioDTO negozioDTO = null;
            if(negozio!= null){
                negozioDTO=new NegozioDTO(negozio.getId(), negozio.getNomeNegozio(),
                        negozio.getIndirizzoNegozio(), negozio.getProvinciaNegozio(),
                        negozio.getNazioneNegozio(),negozio.getDescrizioneNegozio(),
                        negozio.getCittaResidenzaNegozio(),negozio.getUser());
        }
            return negozioDTO;

    }
}
