package com.ws.service.impl;

import com.ws.model.tables.PersonEntity;
import com.ws.repository.IPersonRepository;
import com.ws.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PersonServiceImpl implements IPersonService {


    @Autowired
    private IPersonRepository repository;

    @Override
    public List<PersonEntity> findAllPerson() {
        return repository.findAll();
    }

    @Override
    public PersonEntity savePerson(PersonEntity personEntity) {
        return repository.save(personEntity);
    }

    @Override
    public PersonEntity updatePerson(PersonEntity personEntity, Long id) {
        personEntity.setId(id);
        return repository.save(personEntity);
    }

    @Override
    public String deletePerson(Long id) {

        String msj = "SE ELIMINO CORRECTAMENTE PERSONA CON ID : "+id;

        try {
            repository.deleteById(id);
        }catch (Exception e){

            msj = "OCURRIO UN ERROR AL ELIMINAR PERSONA";
        }
        return msj;
    }

    @Override
    public PersonEntity findByPerson(int age) {
        return repository.findByAge(age);
    }

}
