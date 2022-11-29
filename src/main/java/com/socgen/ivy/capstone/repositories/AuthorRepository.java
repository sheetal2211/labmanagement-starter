package com.socgen.ivy.capstone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.socgen.ivy.capstone.entitities.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
	
    Author save(Author author);
    Author findOneById(Long id);
    void deleteById(Long id);
    
}