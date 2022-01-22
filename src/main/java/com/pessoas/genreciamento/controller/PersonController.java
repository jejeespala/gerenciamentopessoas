package com.pessoas.genreciamento.controller;

import com.pessoas.genreciamento.dto.MessageDTO;
import com.pessoas.genreciamento.dto.PersonDTO;
import com.pessoas.genreciamento.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {

    private final PersonService personService;


    @GetMapping
    public List<PersonDTO> listAll(){

        return personService.listAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageDTO create(@RequestBody @Valid PersonDTO personDTO){

        System.out.println(personDTO);
        return personService.create(personDTO);

    }




}
