package com.socgen.ivy.capstone.controller;

import com.socgen.ivy.capstone.entitities.Author;
import com.socgen.ivy.capstone.repositories.AuthorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Author> getAuthor(@PathVariable("id") Long id) {
        return new ResponseEntity<>(authorRepository.findOneById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Author> saveAuthor(@RequestBody Author author) {
        return new ResponseEntity<>(authorRepository.save(author), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAuthor(@PathVariable("id") Long id) {
        authorRepository.deleteById(id);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Author> updateAuthor(@PathVariable("id") Long id, @RequestBody Author author) {
        author.setId(id);
        return new ResponseEntity<>(authorRepository.save(author), HttpStatus.OK);
    }

}
