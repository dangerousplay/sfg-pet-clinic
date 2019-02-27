package com.dangerousplay.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Criado por Davi Ficanha Henrique em 26/02/2019
 */
@Controller
@RequestMapping("/owners")
public class OwnersController {

    @GetMapping({"", "/", "/index", "/index.html"})
    public String listOwners() {
        return "owners/index";
    }
}
