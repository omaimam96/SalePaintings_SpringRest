package it.contrader.controller;

import it.contrader.converter.ProfiloConverter;
import it.contrader.converter.QuadroConverter;
import it.contrader.dto.QuadroDTO;
import it.contrader.model.Acquisto;
import it.contrader.model.Quadro;
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
    @Autowired
    private QuadroConverter quadroConverter;


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

    @GetMapping("/readbydisp")
    public List<Quadro> readByDisp(){
        return quadroService.readByDisp();
    }

    @GetMapping("/getfilter")
    public List<Quadro> getAllByFilter(@RequestParam String tipologia,
                                       @RequestParam String orientamento,
                                       @RequestParam String ricerca){
        tipologia="%"+tipologia+"%";
        orientamento="%"+orientamento+"%";
        ricerca="%"+ricerca+"%";
        return quadroService.getAllByFilter(tipologia,orientamento,ricerca);
    }
    @GetMapping("/readByAcquistoId")
    public List<QuadroDTO> readAcquistoId(@RequestParam ("id") Acquisto acquistoId) {
        return quadroConverter.toDTOList(quadroService.readByAcquistoId(acquistoId.getId()));
    }


}