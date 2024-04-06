package com.bienestarUsc.bienestarUsc.modelo;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Paciente implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    @Column(unique = true)
    private Integer numeroDocumento;

    private Date fechaNacimiento;
    private String genero;
    private String telefono;
    private String email;
    private String clave;

}
