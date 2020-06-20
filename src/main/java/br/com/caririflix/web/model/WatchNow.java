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
public class WatchNow {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "add_gen")
    @SequenceGenerator(name = "add_gen", initialValue = 1, allocationSize = 1, 
        sequenceName = "watchNow_seq")
    private Number code;

    @Column(name = "Assistir Agora Link 1", nullable = false)
    private String watch_now_1;

    // @Column(name = "Assistir Agora Link 2", nullable = false)
    // private String watch_now_2;
}