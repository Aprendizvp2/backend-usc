package com.bienestarUsc.bienestarUsc.servicio;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bienestarUsc.bienestarUsc.modelo.Medico;
import com.bienestarUsc.bienestarUsc.repositorio.MedicoRepositorio;

@Service
public class MedicoServicio {
    @Autowired
    private MedicoRepositorio medicoRepo;

    public List<Medico> mostrarMedicos(){
        return (List<Medico>) medicoRepo.findAll();
    }

    public Medico guardarMedico(Medico paciente){
        return medicoRepo.save(paciente);
    }

    public Optional<Medico> obtenerPorId(Integer id){
        return medicoRepo.findById(id);
    }

    public boolean eliminarPorId(Integer id){
        try {
            medicoRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
