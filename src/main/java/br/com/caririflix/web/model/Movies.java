package br.com.caririflix.web.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Movies {
    
    @Id
    private Integer code;
    
    @Column(name = "Nome do Filme")
    private String  name;

    @Column(name = "Gênero do Filme")
    private String genre;
 
    @Column(name = "Data de Lançamento")
    private String release_date;
 
    @Column(name = "Direção do Filme")
    private String direction;
 
    @Column(name = "Sinopse do Filme")
    private String synopsis;

    @OneToMany( cascade = CascadeType.ALL)
    @JoinColumn
    private Actor actor;

    @OneToMany( cascade = CascadeType.ALL)
    @JoinColumn
    private Trailer trailer;

    @OneToMany( cascade = CascadeType.ALL)
    @JoinColumn
    private WatchNow watchNow;
}