package com.pessoas.genreciamento.repository;

import com.pessoas.genreciamento.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
