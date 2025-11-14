package com.user.UserService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.UserService.model.User;
import com.user.UserService.repository.UserRepository;

import Exception.UserNotFoundException;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	public UserRepository userRepository;
	
	@PostMapping("/addUsers")
	public User addUser(@Valid @RequestBody User user) {
		
		return userRepository.save(user);
	}
	
	@GetMapping("/{id}")
	public User getUsetById(@PathVariable("id") int id) {
		
		return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found with id :"+id));
	}
															 

	@GetMapping("/getAllDetailsList")
	public List<User>getAllUsers(){
		return userRepository.findAll();
	}
}
