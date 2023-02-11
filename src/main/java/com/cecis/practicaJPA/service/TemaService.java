package com.cecis.practicaJPA.service;

import com.cecis.practicaJPA.model.Tema;
import com.cecis.practicaJPA.repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService implements ITemaService {

    @Autowired
    private ITemaRepository temaRepo;

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
