package com.salesianostriana.dam.ejerciciodto.producto.dto;

import com.salesianostriana.dam.ejerciciodto.producto.model.Producto;

public record ProductoDto (
        String nombre,
        double pvp,
        String imagen,
        String categoria
){

    public static ProductoDto toProductoDto(Producto p) {
        return new ProductoDto(
                p.getNombre(),
                p.getPvp(),
                p.getImagenes().get(0),
                p.getCategoria().getNombre()
        );
    }

}