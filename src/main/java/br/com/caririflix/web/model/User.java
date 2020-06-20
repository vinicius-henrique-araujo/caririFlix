package br.com.caririflix.web.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class User {
    @Id
    @GeneratedValue
    private Integer code;

    @Column(name = "Nome")
    private String name;

    @Column
    private String email;

    @Column(name = "Senha")
    private String password;


}