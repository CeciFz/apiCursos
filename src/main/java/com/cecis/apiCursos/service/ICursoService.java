package com.cecis.apiCursos.service;
import com.cecis.apiCursos.model.Curso;
import java.util.List;

public interface ICursoService {

    public List<Curso> getCursos();
    public void saveCurso(Curso curso);
    public void deleteCurso(Long id);
    public void editCurso(Curso curso);
    public Curso findCursoById (Long id);
    public List<Curso> findCursoByName (String name);

}
