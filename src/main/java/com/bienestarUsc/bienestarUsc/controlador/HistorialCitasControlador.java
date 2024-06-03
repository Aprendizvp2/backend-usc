package com.bienestarUsc.bienestarUsc.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bienestarUsc.bienestarUsc.modelo.*;
import com.bienestarUsc.bienestarUsc.servicio.HistorialCitasServicio;

@RestController
@RequestMapping("/historialCitas")
@CrossOrigin("*")
public class HistorialCitasControlador {
    @Autowired
    private HistorialCitasServicio historialCitasServicio;

    @GetMapping("")
    public List<HistorialCitas> mostrarPorPaciente(@RequestParam("paciente") Paciente pacienteId){
        return historialCitasServicio.mostrarPorPaciente(pacienteId);
    }

    @PostMapping("/agregar")
    public HistorialCitas guardarCita(@RequestBody HistorialCitas historialCitas){
        return historialCitasServicio.guardarCita(historialCitas);
    }

    @PostMapping("/actualizar")
    public HistorialCitas actualizarCita(@RequestBody HistorialCitas historialCitas){
        return historialCitasServicio.guardarCita(historialCitas);
    }

    @GetMapping(path = "/{id}")
    public Optional<HistorialCitas> obtenerPorId(@PathVariable("id") Integer id){
        return historialCitasServicio.obtenerPorId(id);
    }

    @DeleteMapping(path = "/eliminar/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id){
        boolean eliminado = historialCitasServicio.eliminarPorId(id);
        if (eliminado) {
            return "Registro eliminado";
        }
        else{
            return "Registro no eliminado";
        }
    }
}
