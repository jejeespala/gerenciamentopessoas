package com.pessoas.genreciamento.mapper;

import com.pessoas.genreciamento.dto.PersonDTO;
import com.pessoas.genreciamento.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDto(Person person);
}
