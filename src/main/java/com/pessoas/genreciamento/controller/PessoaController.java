package com.pessoas.genreciamento.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vai")
public class PessoaController {

    @GetMapping
    public String message(){

        return "Oi Pessoal";
    }
}
