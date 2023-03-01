package com.example.examplespringboot.controladors;

import com.example.examplespringboot.entitats.Projecte;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("api")
public class ProjecteControlador {
    @GetMapping("hola")
    public String holaMon() {
        return "template.html";
    }

    @GetMapping("projecte")
    public Projecte projecte() {
        return new Projecte("Projecte1", "Acabat");
    }
}
