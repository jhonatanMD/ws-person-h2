package com.ws.service;

import com.ws.model.tables.PersonEntity;

import java.util.List;

public interface IPersonService {

    List<PersonEntity> findAllPerson();
    PersonEntity savePerson(PersonEntity personEntity);
    PersonEntity updatePerson(PersonEntity personEntity, Long id);
    String deletePerson(Long id);

    PersonEntity findByPerson(int age);
}
