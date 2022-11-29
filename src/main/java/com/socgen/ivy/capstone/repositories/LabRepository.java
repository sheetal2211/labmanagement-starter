package com.socgen.ivy.capstone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.socgen.ivy.capstone.entitities.Lab;

@Repository
public interface LabRepository extends JpaRepository<Lab, Long> {
    Lab save(Lab lab);
    Lab findOneById(Long id);
    void deleteById(Long id);
}
