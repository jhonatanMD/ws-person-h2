package com.ws.repository;

import com.ws.model.tables.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonRepository extends JpaRepository<PersonEntity,Long> {

    PersonEntity findByAge(int age);

}
