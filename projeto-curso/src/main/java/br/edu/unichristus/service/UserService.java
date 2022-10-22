package br.edu.unichristus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unichristus.data.model.User;
import br.edu.unichristus.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User create(User user) {
		return repository.save(user);
	}

	public User update(User user) {
		findById(user.getId());
		return repository.save(user);
	}
	
	public void delete(Long id) {
		findById(id);
		repository.deleteById(id);
	}
	
	public List<User> findAll(){
		return repository.findAll();
	}

	public User findById(Long id) {
		var entity = repository.findById(id);
		if (entity.isEmpty()) {
			throw new RuntimeException("Nenhum usuário encontrado");
		}
		return entity.get();
	}

}
