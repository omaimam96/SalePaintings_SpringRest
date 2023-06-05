package it.contrader.dto;

import it.contrader.model.Profilo;
import it.contrader.model.Quadro;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AcquistoDTO {

    private Long id;

    private String dataOrdine;

    private Quadro quadro;

    private Profilo profilo;


}
