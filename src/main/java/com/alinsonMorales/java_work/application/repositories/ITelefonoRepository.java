package com.alinsonMorales.java_work.application.repositories;

import com.alinsonMorales.java_work.application.models.entities.Telefono;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ITelefonoRepository extends JpaRepository<Telefono, Long> {
}
