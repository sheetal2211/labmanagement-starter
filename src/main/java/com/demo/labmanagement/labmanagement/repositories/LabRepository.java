package com.demo.labmanagement.labmanagement.repositories;

import com.demo.labmanagement.labmanagement.entity.Lab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabRepository extends JpaRepository<Lab, Long> {
    Lab save(Lab lab);
    Lab findOneById(Long id);
    void deleteById(Long id);
}
