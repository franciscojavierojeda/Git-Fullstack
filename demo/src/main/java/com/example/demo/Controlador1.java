package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controlador1 {

  @GetMapping("/users/{usuario}")
  public String getHola(@PathVariable String usuario) {
    return "Hola " + usuario;
  }

  @PostMapping("/usuario")
  public Persona devolverEdadMasUno(@RequestBody Persona p){
    p.setEdad(p.getEdad()+1);
    return p;
  }
}
