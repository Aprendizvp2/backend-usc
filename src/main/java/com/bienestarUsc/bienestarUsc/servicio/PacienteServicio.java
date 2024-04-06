package com.bienestarUsc.bienestarUsc.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bienestarUsc.bienestarUsc.modelo.Paciente;
import com.bienestarUsc.bienestarUsc.repositorio.PacienteRepositorio;

@Service
public class PacienteServicio {
    @Autowired
    private PacienteRepositorio pacienteRepo;

    public List<Paciente> mostrarPacientes(){
        return (List<Paciente>) pacienteRepo.findAll();
    }

    public Paciente guardarPaciente(Paciente paciente){
        return pacienteRepo.save(paciente);
    }

    public Optional<Paciente> obtenerPorId(Integer id){
        return pacienteRepo.findById(id);
    }

    public boolean eliminarPorId(Integer id){
        try {
            pacienteRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
