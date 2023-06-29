package it.contrader.converter;

import it.contrader.dto.ProfiloDTO;
import it.contrader.model.Profilo;
import org.springframework.stereotype.Component;

@Component
public class ProfiloConverter extends AbstractConverter<Profilo, ProfiloDTO> {
    @Override
    public Profilo toEntity(ProfiloDTO profiloDTO) {
        Profilo profilo = null;
        if(profiloDTO!= null){
            profilo = new Profilo(profiloDTO.getId(), profiloDTO.getNome(),
                    profiloDTO.getCognome(), profiloDTO.getGenere(),
                    profiloDTO.getEmail(), profiloDTO.getDataNascita(),
                    profiloDTO.getNazione(), profiloDTO.getProvincia(),
                    profiloDTO.getCittaResidenza(), profiloDTO.getIndirizzo(),
                    profiloDTO.getDataCreazione(), profiloDTO.getUser());

        }
        return profilo;
    }

    @Override
    public ProfiloDTO toDTO(Profilo profilo) {
        ProfiloDTO profiloDTO = null;
        if(profilo!= null){
            profiloDTO = new ProfiloDTO(profilo.getId(), profilo.getNome(),
                    profilo.getCognome(),profilo.getGenere(),
                    profilo.getEmail(), profilo.getDataNascita(),
                    profilo.getNazione(),profilo.getProvincia(),
                    profilo.getCittaResidenza(),profilo.getIndirizzo(),
                    profilo.getDataCreazione(),profilo.getUser() );

        }
        return profiloDTO;
    }
}
