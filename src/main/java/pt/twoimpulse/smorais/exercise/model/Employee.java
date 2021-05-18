package pt.twoimpulse.smorais.exercise.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Integer id;
    private String name;
    private Date birthdate;
    private Date created;
    private Date updated;


}
