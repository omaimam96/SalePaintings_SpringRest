package it.contrader.controller;

import it.contrader.converter.NegozioConverter;
import it.contrader.dto.NegozioDTO;
import it.contrader.model.User;
import it.contrader.service.NegozioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/negozio")
@CrossOrigin(origins = "http://localhost:4200")
public class NegozioController extends AbstractController<NegozioDTO>{
    @Autowired
    NegozioConverter negozioConverter;
    @Autowired
    NegozioService negozioService;
    @GetMapping("/readByUser")
    public NegozioDTO reads(@RequestParam("id") User userId){
        return negozioConverter.toDTO(negozioService.readByUserId(userId.getId()));
    }
    @PostMapping("/insert")
    public NegozioDTO insert(@RequestBody NegozioDTO negozioDTO){
        negozioService.insert(negozioDTO);
        return negozioDTO;
    }
    @PatchMapping("/update")
    public NegozioDTO update(@RequestBody NegozioDTO negozioDTO){
        negozioService.update(negozioDTO);
        return negozioDTO;
    }
}
