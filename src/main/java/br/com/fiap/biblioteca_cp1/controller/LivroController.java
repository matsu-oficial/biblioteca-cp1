package br.com.fiap.biblioteca_cp1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {
    @GetMapping("/livros")
    public String listarLivros() {
        return "Lista de livros dísponiveis: Saga Harry Potter, Amanhecer, Java for Dummies";
    }

    @GetMapping("/livros/destaque")
    public String listarDestaque() {
        return "Livro destaque do mês: Java for Dummies";
    }
}
