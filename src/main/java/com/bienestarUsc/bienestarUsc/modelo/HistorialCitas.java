package com.bienestarUsc.bienestarUsc.modelo;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class HistorialCitas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String estado;

    @ManyToOne
    @JoinColumn(name="cita_id")
    private CitasDisponibles citaId;

    @ManyToOne
    @JoinColumn(name="paciente_id")
    private Paciente pacienteId;

    
}
