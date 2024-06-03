package com.bienestarUsc.bienestarUsc.servicio;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bienestarUsc.bienestarUsc.modelo.CitasDisponibles;
import com.bienestarUsc.bienestarUsc.repositorio.CitasDisponiblesRepositorio;

@Service
public class CitasDisponiblesServicio {
    @Autowired
    private CitasDisponiblesRepositorio citasDisponiblesRepo;

//    public List<CitasDisponibles> mostrarCitas(){
//        return (List<CitasDisponibles>) citasDisponiblesRepo.findAll();
//    }
    
    public List<CitasDisponibles> mostrarCitas(String tipoCita, int disponible){
        return (List<CitasDisponibles>) citasDisponiblesRepo.findByTipoCitaAndDisponible(tipoCita, disponible);
    }

    public CitasDisponibles guardarNuevaCita(CitasDisponibles citasDisponibles){
        return citasDisponiblesRepo.save(citasDisponibles);
    }

    public Optional<CitasDisponibles> obtenerPorId(Integer id){
        return citasDisponiblesRepo.findById(id);
    }
}
