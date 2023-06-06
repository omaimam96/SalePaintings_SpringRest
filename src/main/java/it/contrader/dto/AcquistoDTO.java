package it.contrader.dto;

import it.contrader.model.Profilo;
import it.contrader.model.Quadro;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AcquistoDTO {

    private Long id;

    private Date dataOrdine;

    private Quadro quadro;

    private Profilo profilo;


}
