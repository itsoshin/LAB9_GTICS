package org.example.lab9_20206404.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "endpoints")
@Getter
@Setter
public class EndPoints {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int idEndpoints;

    @Column(name = "ruta", nullable = false, length = 255)
    public String ruta;

    @Column(name = "metodo_http", nullable = false, length = 10)
    public String metodo_http;

    @Column(name = "descripcion", nullable = false, length = 255)
    public String descripcion;

    @ManyToOne
    @JoinColumn(name = "api_id")
    private Apis apis;
}
