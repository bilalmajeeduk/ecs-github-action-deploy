package com.demo.person;

import lombok.Data;
@Data
public class Person {

//    @Id
    private String id;
    private String name;
    private Integer age;

    private String cityBorn;

    private Address homeAddress;
    private Address postalAddress;
}
