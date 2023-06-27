package it.contrader.controller;

import it.contrader.converter.ProfiloConverter;
import it.contrader.converter.UserConverter;
import it.contrader.dto.ProfiloDTO;
import it.contrader.dto.UserDTO;
import it.contrader.model.Profilo;
import it.contrader.model.User;
import it.contrader.service.ProfiloService;
import it.contrader.service.ServiceDTO;
import it.contrader.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profilo")
@CrossOrigin(origins = "http://localhost:4200")
public class ProfiloController extends  AbstractController<ProfiloDTO> {

    @Autowired
    private ProfiloService service;

    @Autowired
    private UserService userService;

    @Autowired
    private UserConverter userConverter;
    @Autowired
    private ProfiloConverter profiloConverter;


    @PostMapping("/insert")
    public ProfiloDTO insert(@RequestBody ProfiloDTO profiloDTO){
        service.insert(profiloDTO);
        return profiloDTO;
    }

    @PutMapping("/update")
    public ProfiloDTO update(@RequestBody ProfiloDTO profiloDTO){
        service.update(profiloDTO);
        return profiloDTO;
    }

    @GetMapping("/read")
    public ProfiloDTO read(@RequestParam("id") long id){
        return service.read(id);
    }
    @GetMapping("/readByUser")
    public ProfiloDTO reads(@RequestParam("id")User userId){
        return profiloConverter.toDTO(service.readByUserId(userId.getId()));
    }

    @GetMapping("/readByUserId")
    public List<Profilo> getAllByUser(){
        return service.getAllByUser();
    }
}
