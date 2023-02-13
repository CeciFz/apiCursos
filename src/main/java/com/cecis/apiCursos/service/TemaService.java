package com.cecis.apiCursos.service;

import com.cecis.apiCursos.model.Tema;
import com.cecis.apiCursos.repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService implements ITemaService {

    private ITemaRepository temaRepo;

    @Autowired
    public TemaService(ITemaRepository temaRepo){
        this.temaRepo = temaRepo;
    }

    @Override
    public List<Tema> getTemas() {
        return temaRepo.findAll();
    }

    @Override
    public void saveTema(Tema tema) {
        temaRepo.save(tema);
    }

    @Override
    public void deleteTema(Long id) {
        temaRepo.deleteById(id);
    }

    @Override
    public void editTema(Tema tema) {
        this.saveTema(tema);
    }

    @Override
    public Tema findTema(Long id) {
        return temaRepo.findById(id).orElse(null);
    }
}
