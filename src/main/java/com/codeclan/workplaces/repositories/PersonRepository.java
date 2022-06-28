package com.codeclan.workplaces.repositories;

import com.codeclan.workplaces.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;


    @Repository
    public interface  PersonRepository extends JpaRepository<Person, Long>{

    }
