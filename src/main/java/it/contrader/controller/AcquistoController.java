package it.contrader.controller;

import it.contrader.converter.ProfiloConverter;
import it.contrader.converter.QuadroConverter;
import it.contrader.converter.UserConverter;
import it.contrader.dto.AcquistoDTO;

import it.contrader.dto.ProfiloDTO;
import it.contrader.dto.QuadroDTO;
import it.contrader.dto.UserDTO;
import it.contrader.service.AcquistoService;

import it.contrader.service.ProfiloService;
import it.contrader.service.QuadroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
@RestController
@RequestMapping("/user")
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
    private UserConverter userConverter;
    @Autowired
    private QuadroConverter quadroConverter;


    @GetMapping("/getall")
    public String getAll(HttpServletRequest request) {
        UserDTO userDTO= (UserDTO) request.getSession().getAttribute("user");

        ProfiloDTO profiloDTO=profiloConverter.toDTO(profiloService.readByUser(userConverter.toEntity(userDTO)));
        request.getSession().setAttribute("profiloDTO",profiloDTO);
        setAll(request);
        return "/acquisto/acquistos";


    }

    @GetMapping("/delete")
    public String delete(HttpServletRequest request, @RequestParam("id") Long id) {
        service.delete(id);
        setAll(request);
        return "/acquisto/acquistos";
    }

    @GetMapping("/preupdate")
    public String preUpdate(HttpServletRequest request, @RequestParam("id") Long id) {
        request.getSession().setAttribute("dto", service.read(id));
        return "updateacquisto";
    }

    @PostMapping("/update")
    public String update(HttpServletRequest request, @RequestParam("id") Long id, @RequestParam("dataOrdine") String dataOrdine) {

        AcquistoDTO dto = new AcquistoDTO();
        dto.setId(id);
        dto.setDataOrdine(dataOrdine);
        service.update(dto);
        setAll(request);
        return "acquistos";

    }

    @GetMapping("/ordine")
    public String ordine(HttpServletRequest request, @RequestParam("id") Long id) {
        UserDTO userDTO= (UserDTO) request.getSession().getAttribute("user");
        request.getSession().setAttribute("dto", quadroService.read(id));

        //ReadByID da modificare
        request.getSession().setAttribute("profiloDTO",profiloConverter.toDTO(profiloService.readByUser(userConverter.toEntity(userDTO))));


        return "/acquisto/insertacquisto";
    }

    @PostMapping("/insert")
    public String insert(HttpServletRequest request, @RequestParam("dataOrdine") String dataOrdine,@RequestParam("idquadro") Long quadro,@RequestParam("idprofilo") Long profilo) {

        //DTO per profilo e quadro
        ProfiloDTO profiloDTO=profiloService.read(profilo);
        QuadroDTO quadroDTO=quadroService.read(quadro);

        //DTO da inserire
        AcquistoDTO dto = new AcquistoDTO();
        dto.setDataOrdine(dataOrdine);
        dto.setProfilo(profiloConverter.toEntity(profiloDTO));
        dto.setQuadro(quadroConverter.toEntity(quadroDTO));

        service.insert(dto);
        quadroDTO.setBuy(true);
        quadroService.update(quadroDTO);
        setAll(request);
        return "/acquisto/acquistos";
    }

    @GetMapping("/read")
    public String read(HttpServletRequest request, @RequestParam("id") Long id) {
        request.getSession().setAttribute("dto", service.read(id));
        return "readacquisto";
    }

    private void setAll(HttpServletRequest request) {
        request.getSession().setAttribute("list", service.getAll());
    }
}

