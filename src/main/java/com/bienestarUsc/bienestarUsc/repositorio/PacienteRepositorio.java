package com.bienestarUsc.bienestarUsc.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bienestarUsc.bienestarUsc.modelo.Paciente;

@Repository
public interface PacienteRepositorio extends CrudRepository<Paciente, Integer>{

}
