package com.devs4j.users.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.devs4j.users.models.User;
import com.github.javafaker.Faker;

@Service
public class UserService {
	
	@Autowired
	private Faker faker;
	
	private List<User> users = new ArrayList<>();
	/**
	 * Código para mi servicio
	 */
	
	@PostConstruct
	public void init() {
		for(int i=0; i<50; i++) {
			users.add(new User(faker.funnyName().name(), faker.name().username(), faker.dragonBall().character()));
		}
	}
	
	public User createUser(User user) {
		if(users.stream().anyMatch(u -> u.getUsername().equals(user.getUsername()))) {
			throw new ResponseStatusException(HttpStatus.CONFLICT,
					String.format("El usuario %s ya existe", user.getUsername()));
		}
		users.add(user);
		return user;
	}
	
	public List<User> getUsers(){
		return users;
	}
	
	public User updateUser(User user, String username) {
		User userToBeUpdated = getUserByUsername(username);
		userToBeUpdated.setNickName(user.getNickName());
		userToBeUpdated.setPassword(user.getPassword());
		
		return userToBeUpdated;
	}
	
	public User getUserByUsername(String username) {
		return users.stream().filter(u -> u.getUsername().equals(username)).findAny()
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
						String.format("User %s not found", username)));
	}
	
	public void deleteUser(String username) {
		User userByUsername = getUserByUsername(username);
		users.remove(userByUsername);
	}
	
}
