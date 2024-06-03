package com.bienestarUsc.bienestarUsc.servicio;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bienestarUsc.bienestarUsc.modelo.*;
import com.bienestarUsc.bienestarUsc.repositorio.HistorialCitasRepositorio;

@Service
public class HistorialCitasServicio {
    @Autowired
    private HistorialCitasRepositorio historialCitasRepo;

    public List<HistorialCitas> mostrarPorPaciente(Paciente pacienteId){
        return historialCitasRepo.findByPacienteId(pacienteId);
    }
    
    public HistorialCitas guardarCita(HistorialCitas historialCitas){
        return historialCitasRepo.save(historialCitas);
    }

    public Optional<HistorialCitas> obtenerPorId(Integer id){
        return historialCitasRepo.findById(id);
    }

    public boolean eliminarPorId(Integer id){
        try {
            historialCitasRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
