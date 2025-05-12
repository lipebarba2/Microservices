package com.mcsv.calificacion.service.impl;

import com.mcsv.calificacion.entities.Calificacion;
import com.mcsv.calificacion.repository.CalificacionRepository;
import com.mcsv.calificacion.service.CalificacionService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CalificacionServiceImpl implements CalificacionService {

    private CalificacionRepository calificacionRepository;
    public CalificacionServiceImpl(CalificacionRepository calificacionRepository){
        this.calificacionRepository = calificacionRepository;
    }

    @Override
    public Calificacion create(Calificacion calificacion) {
        return calificacionRepository.save(calificacion);
    }

    @Override
    public List<Calificacion> getCalificaciones() {
        return calificacionRepository.findAll();
    }

    @Override
    public List<Calificacion> getCalificacionesByUserId(String userId) {
        return calificacionRepository.findByUserId(userId);
    }

    @Override
    public List<Calificacion> getCalificacionesByHotelId(String id) {
        return calificacionRepository.findById(id);
    }
}
