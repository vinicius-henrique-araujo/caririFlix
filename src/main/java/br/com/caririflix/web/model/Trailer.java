package br.com.caririflix.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Trailer {
     
    @Id
    private Number code;

    @Column(name = " Link Trailer 1", nullable = false)
    private String trailer1;

    @Column(name = " Link Trailer 2", nullable = false)
    private String trailer2;
}