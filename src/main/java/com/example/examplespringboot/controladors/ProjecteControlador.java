package com.example.examplespringboot.controladors;

import com.example.examplespringboot.entitats.Projecte;
import com.example.examplespringboot.repositoris.ProjecteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("api")
public class ProjecteControlador {
    @Autowired
    ProjecteDAO repositoriProjectes;
    @GetMapping("projectes")
    public String projectes(Model model) {
        model.addAttribute("projectes", repositoriProjectes.findAll());
        return "llista_projectes";
    }
    @GetMapping("hola")
    public String holaMon() {
        return "template.html";
    }

    @GetMapping("projecte")
    public Projecte projecte() {
        return new Projecte("Projecte1", "Acabat");
    }
}
