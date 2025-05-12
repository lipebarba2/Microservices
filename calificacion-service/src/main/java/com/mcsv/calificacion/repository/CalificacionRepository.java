package com.mcsv.calificacion.repository;

import com.mcsv.calificacion.entities.Calificacion;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CalificacionRepository extends MongoRepository<Calificacion, Long> {

    List<Calificacion> findByUserId(String userId);
    List<Calificacion> findById(String id);


}
