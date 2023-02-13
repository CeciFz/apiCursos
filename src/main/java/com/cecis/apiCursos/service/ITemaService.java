package com.cecis.apiCursos.service;

import com.cecis.apiCursos.model.Tema;

import java.util.List;

public interface ITemaService {
    public List<Tema> getTemas();
    public void saveTema(Tema tema);
    public void deleteTema(Long id);
    public void editTema(Tema tema);
    public Tema findTema (Long id);
}
