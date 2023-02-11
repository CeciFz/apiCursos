package com.cecis.practicaJPA.repository;

import com.cecis.practicaJPA.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Long> {

}
