package com.pessoas.genreciamento.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {

    @GetMapping("/vai")
    public String message(){

        return "Oi Pessoal";
    }
}
