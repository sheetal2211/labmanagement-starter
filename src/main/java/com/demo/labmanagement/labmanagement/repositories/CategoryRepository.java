package com.demo.labmanagement.labmanagement.repositories;

import com.demo.labmanagement.labmanagement.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category save(Category category);
    Category findOneById(Long id);
    void deleteById(Long id);
}
