package com.salesianostriana.dam.ejerciciodto.producto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Categoria {
    private Long id;
    private String nombre;
}
