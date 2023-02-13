package com.cecis.apiCursos.controller;

import com.cecis.apiCursos.model.Tema;
import com.cecis.apiCursos.service.ITemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TemaController {

    private ITemaService temaServ;

    @Autowired
    public TemaController(ITemaService temaServ){
        this.temaServ = temaServ;
    }

    @GetMapping("/temas/getAll")
    public List<Tema> getTemas() {
        return temaServ.getTemas();
    }

    @PostMapping("/temas/add")
    public String saveTema(@RequestBody Tema tema) {
        temaServ.saveTema(tema);
        return "El tema se agregó correctamente";
    }

    @PutMapping("/temas/edit")
    public Tema editTema(@RequestBody Tema tema) {
        temaServ.editTema(tema);
        return temaServ.findTema(tema.getId_tema());
    }

    @DeleteMapping("/temas/delete/{id_tema}")
    public String deleteTema(@PathVariable Long id_tema) {
        temaServ.deleteTema(id_tema);
        return "El tema se ha eliminado de la BD";
    }
}
