package it.contrader.converter;

import it.contrader.dto.QuadroDTO;
import it.contrader.model.Quadro;
import org.springframework.stereotype.Component;

import it.contrader.dto.UserDTO;

import it.contrader.model.User;

/**
 * Questa classe implementa i metodi di conversione dell'entità User.
 *
 * @author Vittorio Valent & Girolamo Murdaca
 *
 *@see AbstractConverter
 *@see Converter
 */
@Component
public class QuadroConverter extends AbstractConverter<Quadro, QuadroDTO> {


    @Override
    public Quadro toEntity(QuadroDTO quadroDTO) {
        Quadro quadro = null;
        if (quadroDTO != null) {
            quadro = new Quadro(quadroDTO.getId(),quadroDTO.getNomeQuadro(),quadroDTO.getTipologia(),quadroDTO.getCosto(),quadroDTO.getOrientamento(),quadroDTO.getDescrizione(),quadroDTO.getProfilo(),quadroDTO.isVenduto(), quadroDTO.getCodiceQuadro(),quadroDTO.getAcquisto());
        }
        return quadro;
    }

    @Override
    public QuadroDTO toDTO(Quadro quadro) {
        QuadroDTO quadroDTO =null;
        if (quadro != null) {
            quadroDTO = new QuadroDTO(quadro.getId(),quadro.getNomeQuadro(),quadro.getTipologia(),quadro.getCosto(),quadro.getOrientamento(),quadro.getDescrizione(),quadro.getProfilo(),quadro.isVenduto(), quadroDTO.getCodiceQuadro(),quadroDTO.getAcquisto());

        }
        return quadroDTO;
    }
}