package it.contrader.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import it.contrader.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToOne;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class ProfiloDTO {

    private long id;

    private String nome;

    private String cognome;

    private String genere;

    private String email;

    private Date dataNascita;

    private String nazione;

    private String provincia;

    private String cittaResidenza;

    private String indirizzo;

    private Date dataCreazione;

    private User user;

}
