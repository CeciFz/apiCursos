package com.cecis.apiCursos.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@Entity
public class Curso {

    @Id
    @SequenceGenerator(name="sequenciaCurso",sequenceName="DB_SEQUENCIA_CURSO", allocationSize=1)
    @GeneratedValue(generator = "sequenciaCurso")
    private Long id_curso;
    private String nombre;
    private String modalidad;
    @JsonFormat(pattern="dd/MM/yyy")
    private LocalDate fecha_finalizacion;
    @OneToMany
    private List<Tema> listaDeTemas;

    public Curso() { }

    public Curso(Long id_curso, String nombre, String modalidad,
                 LocalDate fecha_finalizacion, List<Tema> listaDeTemas) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fecha_finalizacion = fecha_finalizacion;
        this.listaDeTemas = listaDeTemas;
    }
}
