package com.ws.model.dto;

import lombok.Data;

@Data
public class PersonModel {

    private Long id;

    private String name;

    private String lastName;

    private String address;

    private int age;
}
