package com.dangerousplay.sfgpetclinic.controllers;

import com.dangerousplay.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Criado por Davi Ficanha Henrique em 26/02/2019
 */
@Controller
@RequestMapping("/vets")
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping({"", "/", "/index", "/index.html"})
    public String listOfVets(Model model) {
        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }

}
