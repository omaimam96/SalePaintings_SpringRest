package it.contrader.controller;

import it.contrader.dto.QuadroDTO;
import it.contrader.service.QuadroService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/quadro")
@CrossOrigin(origins = "http://localhost:4200")
public class QuadroController extends AbstractController<QuadroDTO>{

    @Autowired
    private QuadroService quadroService;


    //POST Angular a UserDTO

}