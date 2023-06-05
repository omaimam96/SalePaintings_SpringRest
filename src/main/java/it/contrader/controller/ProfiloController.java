package it.contrader.controller;

import it.contrader.converter.UserConverter;
import it.contrader.dto.ProfiloDTO;
import it.contrader.dto.UserDTO;
import it.contrader.model.User;
import it.contrader.service.ServiceDTO;
import it.contrader.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profilo")
@CrossOrigin(origins = "http://localhost:4200")
public class ProfiloController extends  AbstractController<ProfiloDTO> {

    @Autowired
    private ServiceDTO<ProfiloDTO> service;

    @Autowired
    private UserService userService;

    @Autowired
    private UserConverter userConverter;


    @PostMapping("/insert")
    public ProfiloDTO insert(@RequestBody ProfiloDTO profiloDTO){
        User user = userConverter.toEntity(userService.findById(profiloDTO.getUser().getId()));
        profiloDTO = new ProfiloDTO(profiloDTO.getId(), profiloDTO.getNome(), profiloDTO.getCognome(), profiloDTO.getGenere(), profiloDTO.getEmail(), profiloDTO.getDataNascita(), profiloDTO.getNazione(), profiloDTO.getProvincia(), profiloDTO.getCittaResidenza(), profiloDTO.getIndirizzo(), user );
        service.insert(profiloDTO);
        return profiloDTO;
    }

}
