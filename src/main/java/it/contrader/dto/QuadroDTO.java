package it.contrader.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class QuadroDTO {

    private long id;

    private String nomeQuadro;

    private String tipologia;

    private double costo;

    private String orientamento;

    private String descrizione;

    private Profilo profilo;

    private boolean venduto;


}

