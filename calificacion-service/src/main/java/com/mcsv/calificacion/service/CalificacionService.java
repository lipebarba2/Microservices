package com.mcsv.calificacion.service;

import com.mcsv.calificacion.entities.Calificacion;

import java.util.List;

public interface CalificacionService {

    Calificacion create(Calificacion calificacion);

    List<Calificacion> getCalificaciones();

    List<Calificacion> getCalificacionesByUserId(String userId);

    List<Calificacion> getCalificacionesByHotelId(String id);

}
