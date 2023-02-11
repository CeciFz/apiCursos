package com.cecis.practicaJPA.model;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tema {

    @Id
    @GeneratedValue(generator = "sequenciaTema")
    @SequenceGenerator(name="sequenciaTema",sequenceName="DB_SEQUENCIA_TEMA", allocationSize=1)
    private Long id_tema;
    private String nombre;
    private String descripcion;

    public Tema() {
    }

    public Tema(Long id_tema, String nombre, String descripcion) {
        this.id_tema = id_tema;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
