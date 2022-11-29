package com.demo.labmanagement.labmanagement.repositories;

import com.demo.labmanagement.labmanagement.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    Author save(Author author);
    Author findOneById(Long id);
    void deleteById(Long id);
}