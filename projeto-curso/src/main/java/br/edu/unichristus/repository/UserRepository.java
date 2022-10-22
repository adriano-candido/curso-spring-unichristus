package br.edu.unichristus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.unichristus.data.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
