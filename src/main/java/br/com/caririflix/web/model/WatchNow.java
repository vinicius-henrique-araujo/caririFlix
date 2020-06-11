package br.com.caririflix.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class WatchNow {
     
    @Id
    private Number code;

    @Column(name = "Assistir Agora Link 1", nullable = false)
    private String watch_now_1;

    @Column(name = "Assistir Agora Link 2", nullable = false)
    private String watch_now_2;
}