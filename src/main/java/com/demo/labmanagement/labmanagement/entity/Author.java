package com.demo.labmanagement.labmanagement.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Author {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
}
