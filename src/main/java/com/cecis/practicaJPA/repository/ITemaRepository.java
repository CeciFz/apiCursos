package com.cecis.practicaJPA.repository;

import com.cecis.practicaJPA.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository<Tema, Long> {

}
