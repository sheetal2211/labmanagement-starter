package com.socgen.ivy.capstone.controller;

import com.socgen.ivy.capstone.entitities.Category;
import com.socgen.ivy.capstone.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @PostMapping
    public ResponseEntity<Category> saveCategory(@RequestBody Category category) {
        return new ResponseEntity<>(categoryRepository.save(category), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategory(@PathVariable("id") Long id) {
        return new ResponseEntity<>(categoryRepository.findOneById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable("id") Long id) {
        categoryRepository.deleteById(id);
        return new ResponseEntity<>("", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> updateCategory(@PathVariable("id") Long id, @RequestBody Category category) {
        category.setId(id);
        return new ResponseEntity<>(categoryRepository.save(category), HttpStatus.OK);
    }
}