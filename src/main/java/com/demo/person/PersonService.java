package com.demo.person;

public class PersonService {


    public String getPerson() {
        return "Hello Person blah";
    }

    public String createPerson(String name, Integer age) {
        return "Hello " + name + " " + age;
    }
}
