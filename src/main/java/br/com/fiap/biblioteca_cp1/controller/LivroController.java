package br.com.fiap.biblioteca_cp1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {
    @GetMapping("/livros")
    public String listarLivros() {
        return "Lista de livros dísponiveis";
    }

    @GetMapping("/livros/destaque")
    public String listarDestaque() {
        return "Livro destaque do mês: A Revolução dos Bichos";
    }
}
