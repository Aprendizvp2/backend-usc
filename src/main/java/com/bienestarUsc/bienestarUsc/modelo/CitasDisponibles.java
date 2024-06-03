package com.bienestarUsc.bienestarUsc.modelo;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.sql.*;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CitasDisponibles implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date fecha;
    
    @JsonFormat(pattern = "HH:mm")
    private Time hora;
    private String tipoCita;
    private Integer disponible;

    @ManyToOne
    @JoinColumn(name="medico_id")
    private Medico medicoId;

}
