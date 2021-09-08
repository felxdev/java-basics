package com.devs4j.users.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devs4j.users.models.User;
import com.devs4j.users.services.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService users;
	
	@GetMapping("/list")
	public ResponseEntity<List<User>> getUsers(){
		return new ResponseEntity<>(users.getUsers(), HttpStatus.OK);
	}
	
	@GetMapping("/list/{username}")
	public ResponseEntity<User> getUserByUsername(@PathVariable("username") String username){
		return new ResponseEntity<>(users.getUserByUsername(username), HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<User> creatUser(@RequestBody User user){
		return new ResponseEntity<>(users.createUser(user), HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{username}")
	public ResponseEntity<User> updateUser(@PathVariable("username") String username,@RequestBody User user){
		return new ResponseEntity<>(users.updateUser(user, username), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{username}")
	public ResponseEntity<User> deleteByUsername(@PathVariable("username") String username){
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
