package com.dangerousplay.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Criado por Davi Ficanha Henrique em 26/02/2019
 */
@Controller
public class IndexController {

    @GetMapping({"/", "", "index", "index.html"})
    public String index() {
        return "index";
    }
}
