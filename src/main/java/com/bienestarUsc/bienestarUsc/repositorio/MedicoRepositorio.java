package com.bienestarUsc.bienestarUsc.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bienestarUsc.bienestarUsc.modelo.Medico;

@Repository
public interface MedicoRepositorio extends CrudRepository<Medico, Integer>{

}
