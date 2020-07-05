package com.nfp.springboot1;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface PersonRepository extends Repository<Person, Integer> {

    List<Person> findAll();

    Person findOne(int id);

    Person save(Person person);

    void delete(Person person);
}
