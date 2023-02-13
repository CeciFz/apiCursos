package com.cecis.apiCursos.repository;

import com.cecis.apiCursos.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository<Tema, Long> {

}
