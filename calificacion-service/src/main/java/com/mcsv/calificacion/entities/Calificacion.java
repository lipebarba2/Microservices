package com.mcsv.calificacion.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "calificaciones")
public class Calificacion {

    @Id
    private String calificafionId;

    private String userId;

    private String Id;

    private Integer calificacion;

    private String observation;


}
