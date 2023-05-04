package com.example.examplespringboot.controladors;

import com.example.examplespringboot.entitats.Projecte;
import com.example.examplespringboot.repositoris.ProjecteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api")
public class ProjecteControlador {
    @Autowired
    ProjecteDAO repositoriProjectes;
    @GetMapping("projectes")
    public String projectes(Model model) {
        model.addAttribute("projectes", repositoriProjectes.findAll());
        return "projectes/llista_projectes";
    }

    @GetMapping("projectes/nou")
    public String mostrarFormulariProjecte(Model model) {
        Projecte projecte = new Projecte();
        model.addAttribute("projecte", projecte);
        return "projectes/nouProjecte";
    }

    @PostMapping("/projectes/alta")
    public String altaProjecte(Projecte projecte, Model model) {
        repositoriProjectes.save(projecte);
        //fem redirecció per a evitar duplicats
        return "redirect:/api/projectes";
    }

    //Exemples
    @GetMapping("hola")
    public String holaMon() {
        return "template.html";
    }

    @GetMapping("projecte")
    public Projecte projecte() {
        return new Projecte("Projecte1", "Acabat");
    }
}
