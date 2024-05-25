package com.bienestarUsc.bienestarUsc.controlador;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bienestarUsc.bienestarUsc.modelo.CitasDisponibles;
import com.bienestarUsc.bienestarUsc.servicio.CitasDisponiblesServicio;

@RestController
@RequestMapping("/citas")
@CrossOrigin("*")
public class CitasDisponiblesControlador {

    @Autowired
    private CitasDisponiblesServicio citasDisponiblesServicio;

    @GetMapping("/")
    public List<CitasDisponibles> mostrarCitas(){
        return citasDisponiblesServicio.mostrarCitas();
    }

    @GetMapping(path = "/{id}")
    public Optional<CitasDisponibles> obtenerPorId(@PathVariable("id") Integer id){
        return citasDisponiblesServicio.obtenerPorId(id);
    }

    @PostMapping("/agregar")
    public CitasDisponibles guardarNuevaCita(@RequestBody CitasDisponibles citasDisponibles){
        return citasDisponiblesServicio.guardarNuevaCita(citasDisponibles);
    }

    @PostMapping("/actualizar")
    public CitasDisponibles actualizarCita(@RequestBody CitasDisponibles citasDisponibles){
        return citasDisponiblesServicio.guardarNuevaCita(citasDisponibles);
    }
}
