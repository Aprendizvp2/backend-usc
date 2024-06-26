package com.bienestarUsc.bienestarUsc.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bienestarUsc.bienestarUsc.modelo.*;
import java.util.List;

@Repository
public interface HistorialCitasRepositorio extends CrudRepository<HistorialCitas, Integer>{
    List<HistorialCitas> findByPacienteId(Paciente pacienteId);
} 
