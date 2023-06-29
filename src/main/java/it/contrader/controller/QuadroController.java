package it.contrader.controller;

import it.contrader.converter.ProfiloConverter;
import it.contrader.dto.ProfiloDTO;
import it.contrader.dto.QuadroDTO;
import it.contrader.model.Profilo;
import it.contrader.service.ProfiloService;
import it.contrader.service.QuadroService;
import it.contrader.service.ServiceDTO;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/quadro")
@CrossOrigin(origins = "http://localhost:4200")
public class QuadroController extends AbstractController<QuadroDTO>{

    @Autowired
    private ServiceDTO<QuadroDTO> service;
    @Autowired
    private QuadroService quadroService;
    @Autowired
    private ProfiloService profiloService;
    @Autowired
    private ProfiloConverter profiloConverter;


    //POST Angular a UserDTO


    @PostMapping("/insert")
    public QuadroDTO insert(@RequestBody QuadroDTO quadroDTO){
        service.insert(quadroDTO);
        return quadroDTO;
    }

    @GetMapping("/read")
    public QuadroDTO read(@RequestParam("id") long id){
        return service.read(id);
    }

    @PutMapping("/update")
    public QuadroDTO update(@RequestBody QuadroDTO quadroDTO){
        service.update(quadroDTO);
        return quadroDTO;
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam("id") long id) {
        service.delete(id);
        return "DELETE_OK";
    }


}