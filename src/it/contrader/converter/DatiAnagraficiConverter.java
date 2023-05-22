package it.contrader.converter;

import it.contrader.dto.DatiAnagraficiDTO;
import it.contrader.model.DatiAnagrafici;

import java.util.ArrayList;
import java.util.List;

public class DatiAnagraficiConverter {

    public DatiAnagraficiDTO toDTO(DatiAnagrafici datiAnagrafici){
        DatiAnagraficiDTO datiAnagraficiDTO= new DatiAnagraficiDTO(datiAnagrafici.getId(), datiAnagrafici.getNome(),
                datiAnagrafici.getCognome(), datiAnagrafici.getGenere(), datiAnagrafici.getDatadinascita(),
                datiAnagrafici.getNazione(), datiAnagrafici.getProvincia(), datiAnagrafici.getCittaResidenza(),
<<<<<<< HEAD
                datiAnagrafici.getIndirizzo(),datiAnagrafici.getUser());
=======
                datiAnagrafici.getIndirizzo());
>>>>>>> fd267c7 (restore first Application.java)
        return datiAnagraficiDTO;
    }
    public DatiAnagrafici toEntity(DatiAnagraficiDTO datiAnagraficiDTO){
        DatiAnagrafici datiAnagrafici= new DatiAnagrafici(datiAnagraficiDTO.getId(), datiAnagraficiDTO.getNome(),
                datiAnagraficiDTO.getCognome(), datiAnagraficiDTO.getGenere(), datiAnagraficiDTO.getDatadinascita(),
                datiAnagraficiDTO.getNazione(), datiAnagraficiDTO.getProvincia(), datiAnagraficiDTO.getCittaResidenza(),
<<<<<<< HEAD
                datiAnagraficiDTO.getIndirizzo(),datiAnagraficiDTO.getUser());
=======
                datiAnagraficiDTO.getIndirizzo());
>>>>>>> fd267c7 (restore first Application.java)
        return datiAnagrafici;
    }
    public List<DatiAnagraficiDTO> toDTOList(List<DatiAnagrafici> datiAnagraficiList){
        List<DatiAnagraficiDTO> datiAnagraficiDTOList= new ArrayList<DatiAnagraficiDTO>();

        for (DatiAnagrafici datiAnagrafici:datiAnagraficiList) {
            datiAnagraficiDTOList.add(toDTO(datiAnagrafici));

        }
        return  datiAnagraficiDTOList;
    }
}
