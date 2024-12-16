package com.salesianostriana.dam.ejerciciodto;

import com.salesianostriana.dam.ejerciciodto.alumno.dto.AlumnoDto;
import com.salesianostriana.dam.ejerciciodto.alumno.model.Alumno;
import com.salesianostriana.dam.ejerciciodto.alumno.model.Curso;
import com.salesianostriana.dam.ejerciciodto.alumno.model.Direccion;
import com.salesianostriana.dam.ejerciciodto.producto.dto.ProductoDto;
import com.salesianostriana.dam.ejerciciodto.producto.model.Categoria;
import com.salesianostriana.dam.ejerciciodto.producto.model.Producto;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MainDeMentira {

    @PostConstruct
    public void init() {

        Categoria frutas = Categoria.builder()
                .id(2L)
                .nombre("Frutas")
                .build();

        Producto p = Producto.builder()
                .id(2L)
                .nombre("Manzana")
                .desc("Una fruta dulce, saludable y deliciosa, ideal para el día a día.")
                .pvp(1.20)
                .imagenes(Arrays.asList(
                        "https://upload.wikimedia.org/wikipedia/commons/f/f4/Honeycrisp.jpg",
                        "https://cdn.pixabay.com/photo/2016/11/29/09/08/apple-1867396_1280.jpg"))
                .categoria(frutas)
                .build();

        ProductoDto producto = ProductoDto.toProductoDto(p);
        System.out.println(producto);

        Direccion direccion = Direccion.builder()
                .id(2L)
                .tipoVia("Avenida")
                .linea1("Paseo de la Castellana 112")
                .linea2("5ºD")
                .cp(28046)
                .poblacion("Madrid")
                .provincia("Madrid")
                .build();

        Curso curso = Curso.builder()
                .id(2L)
                .nombre("Segundo")
                .tipo("ESO")
                .tutor("Ana María Gómez")
                .aula("205")
                .build();

        Alumno a = Alumno.builder()
                .id(2L)
                .nombre("Laura")
                .apellido1("Pérez")
                .apellido2("Martínez")
                .telefono("689123456")
                .email("laura.perez@gmail.com")
                .direccion(direccion)
                .curso(curso)
                .build();

        AlumnoDto alumno = AlumnoDto.toAlumnoDto(a);
        System.out.println(alumno);
    }
}
