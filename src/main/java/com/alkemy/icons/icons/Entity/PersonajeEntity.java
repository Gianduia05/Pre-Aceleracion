package com.alkemy.icons.icons.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.GenerationType;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "personaje")
@Getter
@Setter


public class PersonajeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;

    private String nombre;

    private String edad;

    private String peso;

    private String Historia;

    @ManytoManey(mappedBy = "personaje" , cascade = CascadeType.ALL)
    private List<PeliculaEntity> pelicula = new ArrayList<>();


}
