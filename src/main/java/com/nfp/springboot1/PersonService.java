package com.nfp.springboot1;

import java.util.List;

public interface PersonService {
    List<Person>listar();
    Person listarId(int id);
    Person add(Person person);
    Person edit(Person person);
    Person delete(int id);

}
