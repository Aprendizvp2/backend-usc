package com.bienestarUsc.bienestarUsc.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bienestarUsc.bienestarUsc.modelo.Medico;
import com.bienestarUsc.bienestarUsc.servicio.MedicoServicio;

@RestController
@RequestMapping("/medicos")
public class MedicoControlador {
    @Autowired
    private MedicoServicio medicoServicio;

    @GetMapping("/")
    public List<Medico> mostrarMedicos(){
        return medicoServicio.mostrarMedicos();
    }

    @PostMapping("/agregar")
    public Medico guardarMedico(@RequestBody Medico medico){
        return medicoServicio.guardarMedico(medico);
    }

    @PostMapping("/actualizar")
    public Medico actualizarMedico(@RequestBody Medico medico){
        return medicoServicio.guardarMedico(medico);
    }

    @GetMapping(path = "/{id}")
    public Optional<Medico> obtenerPorId(@PathVariable("id") Integer id){
        return medicoServicio.obtenerPorId(id);
    }

    @DeleteMapping(path = "/eliminar/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id){
        boolean eliminado = medicoServicio.eliminarPorId(id);
        if (eliminado) {
            return "Registro eliminado";
        }
        else{
            return "Registro no eliminado";
        }
    }
}
