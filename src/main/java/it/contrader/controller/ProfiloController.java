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
        service.insert(profiloDTO);
        return profiloDTO;
    }

    @PatchMapping("/update")
    public ProfiloDTO update(@RequestBody ProfiloDTO profiloDTO){
        service.update(profiloDTO);
        return profiloDTO;
    }

    @GetMapping("/read")
    public ProfiloDTO read(@RequestParam long id){
        return service.read(id);
    }


}
