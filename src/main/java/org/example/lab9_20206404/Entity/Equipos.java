package org.example.lab9_20206404.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "equipos")
@Getter
@Setter
@JsonIgnoreProperties(value = {""})
public class Equipos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombreEquipo;

    @Column(name = "area", nullable = false, length = 100)
    private String area;
}
