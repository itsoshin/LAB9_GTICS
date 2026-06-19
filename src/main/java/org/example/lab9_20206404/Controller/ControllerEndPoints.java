package org.example.lab9_20206404.Controller;

import org.example.lab9_20206404.Entity.EndPoints;
import org.example.lab9_20206404.Repository.RepositoryEndPoints;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/endpoints")
public class ControllerEndPoints {
    final RepositoryEndPoints repositoryEndPoints;

    public ControllerEndPoints(RepositoryEndPoints repositoryEndPoints) {
        this.repositoryEndPoints = repositoryEndPoints;
    }

    @GetMapping("")
    public List<EndPoints> listar() {
        return repositoryEndPoints.findAll();
    }
}
