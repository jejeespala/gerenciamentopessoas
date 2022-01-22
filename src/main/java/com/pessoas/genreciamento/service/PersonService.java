package com.pessoas.genreciamento.service;

import com.pessoas.genreciamento.dto.MessageDTO;
import com.pessoas.genreciamento.dto.PersonDTO;
import com.pessoas.genreciamento.mapper.PersonMapper;
import com.pessoas.genreciamento.model.Person;
import com.pessoas.genreciamento.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {


    private final PersonRepository personRepository;

    private final PersonMapper personMapper;

    public List<PersonDTO> listAll(){

        List<Person> people = personRepository.findAll();

        return people.stream()
                .map(personMapper::toDto)
                .collect(Collectors.toList());

    }

    public MessageDTO create(PersonDTO personDTO){

        Person person = personMapper.toModel(personDTO);

        System.out.println(person);

        Person savedPerson = personRepository.save(person);

        MessageDTO messageResponse = createMessageResponse("Person successfully created with ID ", savedPerson.getId());

        return messageResponse;
    }


    private MessageDTO createMessageResponse(String s, Long id2) {
        return MessageDTO.builder()
                .message(s + id2)
                .build();
    }



}
