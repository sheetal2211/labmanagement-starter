package com.socgen.ivy.capstone.controller;

import com.socgen.ivy.capstone.entitities.Lab;
import com.socgen.ivy.capstone.repositories.LabRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/lab")
public class LabController {

    @Autowired
    private LabRepository labRepository;

    @PostMapping
    public ResponseEntity<Lab> saveLab(@RequestBody Lab lab) {
        return new ResponseEntity<>(labRepository.save(lab), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lab> getLab(@PathVariable("id") Long id) {
        return new ResponseEntity<>(labRepository.findOneById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteLab(@PathVariable("id") Long id) {
        labRepository.deleteById(id);
        return new ResponseEntity<>("", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Lab> updateLab(@PathVariable("id") Long id, @RequestBody Lab lab) {
        lab.setId(id);
        return new ResponseEntity<>(labRepository.save(lab), HttpStatus.OK);
    }
}