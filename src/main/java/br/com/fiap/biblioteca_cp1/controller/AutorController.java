package br.com.fiap.biblioteca_cp1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutorController {
    @GetMapping("/autores")
    public String listarLivros() {
        return "Autores famosos: John Green, Clarice Lispector";
    }
}
