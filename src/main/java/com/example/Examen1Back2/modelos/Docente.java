package com.example.Examen1Back2.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "docentes")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String especialidad;

    public Docente() {}

    public Docente(Integer id, String especialidad) {
        this.id = id;
        this.especialidad = especialidad;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
}
