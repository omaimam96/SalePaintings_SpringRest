package it.contrader.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import it.contrader.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class NegozioDTO {
    private long id;
    private String nomeNegozio;
    private String indirizzoNegozio;
    private String provinciaNegozio;
    private String nazioneNegozio;
    private String descrizioneNegozio;
    private String cittaResidenzaNegozio;
    private User user;


}
