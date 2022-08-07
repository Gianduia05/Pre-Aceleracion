package com.alkemy.icons.icons.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name ="pelicula")
@Getter
@Setter

public class PeliculaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;

    private String titulo;

    @Column(name = "fecha_de_creacion", nullable = false)
    private Long fechaCreacion;

    private Long calidifacion; // 1-5

    @ManytoOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoiunColumn(name = "genero_id", insertable = false, updatable = false)
    private GeneroEntity genero;

    @Column(name = "genero_id", nullable = false)
    private Long generoId;

    @ManytoMany(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })

    @JoinTable(
            name = "personaje_pelicula",
            joinColumns = @JoinColumn(name = "pelicula"),
            inverseJoinColumns = @JoinColumn(name = "personaje"))
    private Set<PersonajeEntity> personaje = new HashSet<>();

    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PeliculaEntity other = (PeliculaEntity) obj;
        return other.id == this.id;
    }


}