package org.example.lab9_20206404.Repository;

import org.example.lab9_20206404.Entity.EndPoints;
import org.example.lab9_20206404.Entity.Equipos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEndPoints extends JpaRepository<EndPoints,Integer> {
}
