package it.contrader.controller;

import it.contrader.converter.NegozioConverter;
import it.contrader.converter.ProfiloConverter;
import it.contrader.converter.UserConverter;
import it.contrader.dto.NegozioDTO;
import it.contrader.dto.ProfiloDTO;
import it.contrader.service.NegozioService;
import it.contrader.service.ProfiloService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import it.contrader.dto.LoginDTO;
import it.contrader.dto.UserDTO;
import it.contrader.service.UserService;


/**
 * 
 * Questa classe estende AbstractController con tipo UserDTO.
 * In aggiunta ai metodi di CRUD si implementa il metodo di login.
 * 
 * @author Vittorio Valent & Girolamo Murdaca
 * 
 * @param<UserDTO>
 * 
 * @see AbstractController
 *
 */
@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController extends AbstractController<UserDTO>{
	
	@Autowired
	private UserService userService;
	@Autowired
	private ProfiloService profiloService;
	@Autowired
	private ProfiloConverter profiloConverter;
	@Autowired
	private UserConverter userConverter;
	@Autowired
	private NegozioConverter negozioConverter;
	@Autowired
	private NegozioService negozioService;


	//POST Angular a UserDTO
	@PostMapping(value = "/login")
	public UserDTO login( @RequestBody LoginDTO loginDTO ) {
		return userService.findByUsernameAndPassword(loginDTO.getUsername(), loginDTO.getPassword());
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam("id") long id){
		ProfiloDTO profiloDTO=profiloConverter.toDTO(profiloService.readByUser(userConverter.toEntity(userService.read(id))));
		profiloDTO.setUser(null);
		NegozioDTO negozioDTO =negozioConverter.toDTO(negozioService.readByUserId(userConverter.toEntity(userService.read(id)).getId()));
		negozioDTO.setUser(null);
		profiloService.update(profiloDTO);
		negozioService.update(negozioDTO);
		userService.delete(id);
		return "DELETE_OK";
	}


}