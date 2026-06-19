package org.example.lab9_20206404.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "apis")
@Getter
@Setter

public class Apis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int id;

    @Column(name = "nombre", nullable = false, length = 150)
    public String nombre;

    @Column(name = "version", nullable = false, length = 20)
    public String version;

    @Column(name = "fecha_registro", nullable = false)
    public Date fecha_registro;

    @Column(name = "estado", nullable = false, length = 20)
    public String estado;

    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private Equipos equipos;

}
