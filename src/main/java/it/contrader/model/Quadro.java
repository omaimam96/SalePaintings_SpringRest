package it.contrader.model;

import javax.persistence.Entity;

import javax.persistence.*;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Quadro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nomeQuadro;

    private String tipologia;

    private double costo;

    private String orientamento;

    private String descrizione;

    @ManyToOne
    private Profilo profilo;

    private boolean venduto;

    private String codiceQuadro;

    @ManyToOne
    private Acquisto acquisto;
}
