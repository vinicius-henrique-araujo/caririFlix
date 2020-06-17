package br.com.caririflix.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Trailer {
     
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "add_gen")
    @SequenceGenerator(name = "add_gen", initialValue = 1, allocationSize = 1, 
        sequenceName = "trailer_seq")
    private Number code;

    @Column(name = " Link Trailer 1", nullable = false)
    private String trailer1;

//     @Column(name = " Link Trailer 2", nullable = false)
//     private String trailer2;
}