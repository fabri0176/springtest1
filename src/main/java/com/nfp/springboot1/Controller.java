package com.nfp.springboot1;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost", maxAge = 3600)
@RestController
@RequestMapping({"/persons"})
public class Controller {

    @Autowired
    PersonService service;

    @GetMapping
    public List<Person>listar() {
        return service.listar();
    }
    
}
