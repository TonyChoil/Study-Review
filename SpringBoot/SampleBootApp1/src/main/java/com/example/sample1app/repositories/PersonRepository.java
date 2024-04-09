package com.example.sample1app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sample1app.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
