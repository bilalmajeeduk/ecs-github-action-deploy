package com.demo.person;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


@Data
@RestController
public class PersonController {



    @Value("${custom-app-name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;



    @GetMapping(value="/person")
    public String getPerson() {
        return "HELLO COMING FROM BILAL MACBOOK Refactored - " + appName + " - " + appVersion + " - " + LocalDateTime.now();
    }


    @GetMapping(value="/person/info/{id}")
    public Person getPersonInfo(@PathVariable Long id) {
        Person person = new Person();
        person.setAge(20);
        return person;
    }



    @GetMapping("/api/actuator/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("OK");
    }

}
