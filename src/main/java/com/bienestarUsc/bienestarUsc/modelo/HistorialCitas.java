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

    private Date fecha;
    private String tipoCita;
    private String descripcion;
    private String medicamentos;

    @ManyToOne
    @JoinColumn(name="paciente_id")
    private Paciente pacienteId;

    @ManyToOne
    @JoinColumn(name="medico_id")
    private Medico medicoId;
}
