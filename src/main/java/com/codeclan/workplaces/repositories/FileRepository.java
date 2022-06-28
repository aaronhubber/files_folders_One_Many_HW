package com.codeclan.workplaces.repositories;

import com.codeclan.workplaces.models.File;
import com.codeclan.workplaces.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  FileRepository extends JpaRepository<File, Long> {

}
