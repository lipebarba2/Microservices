package com.mcsv.calificacion.controllers;


import com.mcsv.calificacion.entities.Calificacion;
import com.mcsv.calificacion.service.CalificacionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calificaciones")
public class CalificacionController {

    private CalificacionService calificacionService;
    public CalificacionController(CalificacionService calificacionService){
        this.calificacionService = calificacionService;

    }

    @PostMapping
    public ResponseEntity<Calificacion> createCalificacion(@RequestBody Calificacion calificacion){
        return ResponseEntity.ok(calificacionService.create(calificacion));
    }

    @GetMapping
    public ResponseEntity<List<Calificacion>> getCalificaciones(){
        return ResponseEntity.ok(calificacionService.getCalificaciones());
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Calificacion>> getCalificacionesByUserId(@PathVariable String userId){
        return ResponseEntity.ok(calificacionService.getCalificacionesByUserId(userId));
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<List<Calificacion>> getCalificacionesByHotelId(@PathVariable String id){
        return ResponseEntity.ok(calificacionService.getCalificacionesByHotelId(id));
    }
}
