package it.contrader.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Negozio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nomeNegozio;
    private String indirizzoNegozio;
    private String provinciaNegozio;
    private String nazioneNegozio;
    private String descrizioneNegozio;
    private String cittaResidenzaNegozio;

    @OneToOne
    private User user;


}
