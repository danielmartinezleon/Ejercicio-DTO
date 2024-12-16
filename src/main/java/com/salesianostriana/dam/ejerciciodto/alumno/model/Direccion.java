package com.salesianostriana.dam.ejerciciodto.alumno.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Direccion {
    private Long id;
    private String tipoVia;
    private String linea1;
    private String linea2;
    private int cp;
    private String poblacion;
    private String provincia;
}
