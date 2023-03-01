package com.example.examplespringboot.controladors;

import com.example.examplespringboot.entitats.Projecte;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("apirest")
public class ProjecteRestControlador {
    @GetMapping("hola")
    public String holaMon() {
        return "<h1>hola mon</h1>";
    }

    @GetMapping("projecte")
    public Projecte projecte() {
        return new Projecte("Projecte1", "Acabat");
    }
}
