package br.com.caririflix.web.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "add_gen")
    @SequenceGenerator(name = "add_gen", initialValue = 1, allocationSize = 1, 
        sequenceName = "actor_seq")
    private Number code;
    
    @Column(name = "Nome do Ator")
    private String name;

    @Column(name = "Idade")
    private String idade;

    @Column(name = "Data de Nascimento")
    private String birth;

    @Column(name = "Nome do Personagem")
    private String character;
    
}