package com.cecis.apiCursos.service;

import com.cecis.apiCursos.model.Curso;
import com.cecis.apiCursos.repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService implements ICursoService {

    private ICursoRepository cursoRep;

    @Autowired
    public CursoService(ICursoRepository cursoRep){
        this.cursoRep = cursoRep;
    }

    @Override
    public List<Curso> getCursos() {
        return cursoRep.findAll();
    }

    @Override
    public void saveCurso(Curso curso) {
        cursoRep.save(curso);
    }

    @Override
    public void deleteCurso(Long id) {
        cursoRep.deleteById(id);
    }

    @Override
    public void editCurso(Curso curso) {
        this.saveCurso(curso);
    }

    @Override
    public Curso findCursoById(Long id) {
        return cursoRep.findById(id).orElse(null);
    }

    @Override
    public List<Curso> findCursoByName(String name) {
        List<Curso> listaCursos = cursoRep.findAll();
        List<Curso> foundList = new ArrayList<>();

        for (Curso curso : listaCursos) {
            if(curso.getNombre().toUpperCase().contains(name.toUpperCase())) foundList.add(curso);
        }

        return foundList;
    }
}
