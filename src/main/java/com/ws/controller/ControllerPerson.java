package com.ws.controller;

import com.ws.model.tables.PersonEntity;
import com.ws.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/person")
public class ControllerPerson {

    @Autowired
    private IPersonService service;

    @GetMapping("/findAll")
    public List<PersonEntity> getFindAll(){
        return service.findAllPerson();
    }

    @GetMapping("/findByAge/{age}")
    public ResponseEntity getFindByAge(@PathVariable("age") int age){

        PersonEntity person = service.findByPerson(age);
        if(person == null)
            return ResponseEntity.ok("NO SE ENCONTRO PERSONA");

        return ResponseEntity.ok().body(person);
    }

    @PostMapping("/save")
    public PersonEntity postSave(@RequestBody PersonEntity personEntity){
        return service.savePerson(personEntity);
    }

    @PutMapping("/update/{id}")
    public PersonEntity putUpdate(@RequestBody PersonEntity personEntity , @PathVariable("id") long id){
        return service.updatePerson(personEntity,id);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam("id") long id){

        return service.deletePerson(id);
    }


}
