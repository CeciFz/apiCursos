package com.cecis.practicaJPA.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Getter @Setter
@Entity
public class Curso {

    @Id
    @GeneratedValue(generator = "sequenciaCurso")
    @SequenceGenerator(name="sequenciaCurso",sequenceName="DB_SEQUENCIA_CURSO", allocationSize=1)
    private Long id_curso;
    private String nombre;
    private String modalidad;
    private Date fecha_finalizacion;
    @OneToMany
    private List<Tema> listaDeTemas;

    public Curso() { }

    public Curso(Long id_curso, String nombre, String modalidad,
                 Date fecha_finalizacion, List<Tema> listaDeTemas) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fecha_finalizacion = fecha_finalizacion;
        this.listaDeTemas = listaDeTemas;
    }
}
