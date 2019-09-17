package com.mkacunha.javadeepcode;

public class PersonService {


    private boolean save(Person person) {
        if (!new PersonRepository().exists(person.getName())) {
            new PersonRepository().save(person);
            return true;
        } else {
            new RuntimeException("Person already exists");
            return false;
        }
        return false;
    }

}
