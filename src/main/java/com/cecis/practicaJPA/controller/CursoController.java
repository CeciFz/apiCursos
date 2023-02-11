package com.cecis.practicaJPA.controller;

import com.cecis.practicaJPA.model.Curso;
import com.cecis.practicaJPA.model.Tema;
import com.cecis.practicaJPA.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CursoController {

    @Autowired
    private ICursoService cursoServ;

    @GetMapping("/cursos/getAll")
    public List<Curso> getCursos() {
        return cursoServ.getCursos();
    }

    @GetMapping("/cursos/getTemas/{id_curso}")
    public List<Tema> getTemas(@PathVariable Long id_curso) {
        return cursoServ.findCurso(id_curso).getListaDeTemas();
    }

    @PostMapping("/cursos/add")
    public String saveCurso(@RequestBody Curso curso) {
        cursoServ.saveCurso(curso);
        return "El curso se agregó correctamente";
    }

    @PutMapping("/cursos/edit")
    public Curso editCurso(@RequestBody Curso curso) {
        cursoServ.editCurso(curso);
        return cursoServ.findCurso(curso.getId_curso());
    }

    @DeleteMapping("/cursos/delete/{id_curso}")
    public String deleteCurso(@PathVariable Long id_curso) {
        cursoServ.deleteCurso(id_curso);
        return "El curso se ha eliminado de la BD";
    }
}
