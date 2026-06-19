package org.example.lab9_20206404.Controller;

import org.example.lab9_20206404.Entity.Equipos;
import org.example.lab9_20206404.Repository.RepositoryEquipos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/equipos")
public class ControllerEquipos {
    final RepositoryEquipos repositoryEquipos;

    public ControllerEquipos(RepositoryEquipos repositoryEquipos) {
        this.repositoryEquipos = repositoryEquipos;
    }

    @GetMapping("")
    public List<Equipos> listar() {

        return repositoryEquipos.findAll();
    }
}
