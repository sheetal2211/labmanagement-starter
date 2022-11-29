package com.socgen.ivy.capstone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.socgen.ivy.capstone.entitities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category save(Category category);
    Category findOneById(Long id);
    void deleteById(Long id);
}
