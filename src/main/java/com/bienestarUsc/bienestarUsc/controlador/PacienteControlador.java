package com.bienestarUsc.bienestarUsc.controlador;

import java.util.List;
import java.util.Optional;

import com.bienestarUsc.bienestarUsc.modelo.Paciente;
import com.bienestarUsc.bienestarUsc.servicio.PacienteServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteControlador {
    @Autowired
    private PacienteServicio pacienteServicio;

    @GetMapping("/")
    public List<Paciente> mostrarPacientes(){
        return pacienteServicio.mostrarPacientes();
    }

    @PostMapping("/agregar")
    public Paciente guardarPaciente(@RequestBody Paciente paciente){
        return pacienteServicio.guardarPaciente(paciente);
    }

    @GetMapping(path = "/{id}")
    public Optional<Paciente> obtenerPorId(@PathVariable("id") Integer id){
        return pacienteServicio.obtenerPorId(id);
    }

    @DeleteMapping("/eliminar")
    public String eliminarPorId(@RequestParam("id") Integer id){
        boolean eliminado = pacienteServicio.eliminarPorId(id);
        if (eliminado) {
            return "Registro eliminado";
        }
        else{
            return "Registro no eliminado";
        }
    }
}
