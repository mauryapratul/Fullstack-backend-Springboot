package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.UserDTO;
import model.User;
import service.UserServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	private UserServiceImpl service;
	
	@PostMapping(value = "/addUser")
	public ResponseEntity<User> newUser(@RequestBody UserDTO user){
		User returnUser =service.addUser(user);
		
		return new ResponseEntity<>(returnUser, HttpStatus.OK);
	}
	@GetMapping(value = "user/{id}")
	public User getUser(@PathVariable Long id) {
		User result =service.getUser(id);
		return result;
	}
	@GetMapping("checkurl")
	public String checkUrl() {
		return "This is working fine";
	}

	

}
