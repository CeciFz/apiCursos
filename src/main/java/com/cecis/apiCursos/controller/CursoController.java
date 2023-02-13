package com.cecis.apiCursos.controller;

import com.cecis.apiCursos.model.Curso;
import com.cecis.apiCursos.model.Tema;
import com.cecis.apiCursos.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CursoController {

    private ICursoService cursoServ;

    @Autowired
    public CursoController(ICursoService cursoServ) {
        this.cursoServ = cursoServ;
    }

    @GetMapping("/cursos/getAll")
    public List<Curso> getCursos() {
        return cursoServ.getCursos();
    }

    @PostMapping("/cursos/add")
    public String saveCurso(@RequestBody Curso curso) {
        cursoServ.saveCurso(curso);
        return "El curso se agregó correctamente";
    }

    @PutMapping("/cursos/edit")
    public Curso editCurso(@RequestBody Curso curso) {
        cursoServ.editCurso(curso);
        return cursoServ.findCursoById(curso.getId_curso());
    }

    @DeleteMapping("/cursos/delete/{id_curso}")
    public String deleteCurso(@PathVariable Long id_curso) {
        cursoServ.deleteCurso(id_curso);
        return "El curso se ha eliminado de la BD";
    }


    @GetMapping("/cursos/getTemas/{id_curso}")
    public List<Tema> getTemas(@PathVariable Long id_curso) {
        return cursoServ.findCursoById(id_curso).getListaDeTemas();
    }


    @GetMapping("/cursos/findCurso")
    public List<Curso> findCursoByName(@RequestParam String name) {
        return cursoServ.findCursoByName(name);
    }
}
