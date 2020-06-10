package br.com.caririflix.web.model;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class Actor {

    @Id
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