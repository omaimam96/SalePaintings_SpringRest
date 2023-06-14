package it.contrader.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profilo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nome;

    private String cognome;

    private String genere;

    private String email;

    private Date dataNascita;

    private String nazione;

    private String provincia;

    private String cittaResidenza;

    private String indirizzo;

    @OneToOne
    private User user;


}
