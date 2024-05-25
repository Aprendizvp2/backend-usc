package com.bienestarUsc.bienestarUsc.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bienestarUsc.bienestarUsc.modelo.CitasDisponibles;

@Repository
public interface CitasDisponiblesRepositorio extends CrudRepository<CitasDisponibles, Integer>{

}
