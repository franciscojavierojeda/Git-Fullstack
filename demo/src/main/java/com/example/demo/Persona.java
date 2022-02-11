package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    String nombre;
    String ciudad;
    Integer edad;

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
