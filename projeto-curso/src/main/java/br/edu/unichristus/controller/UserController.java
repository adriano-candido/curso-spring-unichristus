package br.edu.unichristus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unichristus.data.model.User;
import br.edu.unichristus.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping
	public User create(@RequestBody User user) {
		return service.create(user);
	}

	@PutMapping
	public User update(@RequestBody User user) {
		return service.update(user);
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}

	@GetMapping
	public List<User> findAll() {
		return service.findAll();
	}

	@GetMapping(value = "/{id}")
	public User findById(@PathVariable("id") Long id) {
		return service.findById(id);
	}

}
