package com.demo.person;

import lombok.Data;


@Data
public class Address {

    private String addressLine1 ;
    private String addressLine2 ;
    private String city;
    private String state;
    private String country;
    private String zipCode;

}
