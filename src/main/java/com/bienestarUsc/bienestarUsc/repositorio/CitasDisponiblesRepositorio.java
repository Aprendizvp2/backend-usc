package com.bienestarUsc.bienestarUsc.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bienestarUsc.bienestarUsc.modelo.CitasDisponibles;
import java.util.List;

@Repository
public interface CitasDisponiblesRepositorio extends CrudRepository<CitasDisponibles, Integer>{
    public List<CitasDisponibles> findByTipoCitaAndDisponible(String tipoCita, int disponible); 
}
