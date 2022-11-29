package com.socgen.ivy.capstone.entitities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Category {
    @Id
    private Long id;
    private String name;
}
