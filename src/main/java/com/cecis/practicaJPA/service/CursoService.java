package com.cecis.practicaJPA.service;

import com.cecis.practicaJPA.model.Curso;
import com.cecis.practicaJPA.repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService implements ICursoService {

    @Autowired
    private ICursoRepository cursoRep;

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
    public Curso findCurso(Long id) {
        return cursoRep.findById(id).orElse(null);
    }
}
