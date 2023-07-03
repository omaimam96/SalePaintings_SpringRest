package it.contrader.controller;

import it.contrader.converter.AcquistoConverter;
import it.contrader.converter.ProfiloConverter;
import it.contrader.converter.QuadroConverter;
import it.contrader.converter.UserConverter;
import it.contrader.dto.AcquistoDTO;

import it.contrader.dto.ProfiloDTO;
import it.contrader.dto.QuadroDTO;
import it.contrader.dto.UserDTO;
import it.contrader.model.Acquisto;
import it.contrader.service.AcquistoService;

import it.contrader.service.ProfiloService;
import it.contrader.service.QuadroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/acquisto")
@CrossOrigin(origins = "http://localhost:4200")
public class AcquistoController extends AbstractController<AcquistoDTO>{

    @Autowired
    private AcquistoService service;

    @Autowired
    private QuadroService quadroService;

    @Autowired
    private ProfiloService profiloService;

    @Autowired
    private ProfiloConverter profiloConverter;
    @Autowired
    private AcquistoConverter converter;

    @Autowired
    private UserConverter userConverter;
    @Autowired
    private QuadroConverter quadroConverter;



    @PutMapping("/insert")
    public AcquistoDTO insert(@RequestBody AcquistoDTO acquistoDTO){
        service.insert(acquistoDTO);
        return acquistoDTO;
    }

    @GetMapping("/read")
    public AcquistoDTO read(@RequestParam("id") long id){
        return service.read(id);
    }

    @GetMapping("/readacquisti")
    public List<Acquisto> readacquisti(@RequestParam("id")long id){
        return service.findAcquisti(id);
    }

    @GetMapping("/readacquisto")
    public AcquistoDTO readacquisto(@RequestParam("codiceAcquisto")String codiceAcquisto){
        return converter.toDTO(service.readAcquisto(codiceAcquisto));
    }
}

