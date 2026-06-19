package org.example.lab9_20206404.Controller;

import org.example.lab9_20206404.Entity.Apis;
import org.example.lab9_20206404.Repository.RepositoryApis;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apis")
public class ControllerApis {
    final RepositoryApis RepositoryApis;

    public ControllerApis(RepositoryApis RepositoryApis) {
        this.RepositoryApis = RepositoryApis;
    }

    @GetMapping("")
    public List<Apis> listar() {
        return RepositoryApis.findAll();
    }
}
