package com.mkacunha.javadeepcode;

public class PersonRepository {


    public void save(Person person) {
        person.id = 10;
        System.out.println(person + " saved");
    }


    public boolean exists(String personName) {
        personName = personName.toUpperCase();
        return false;
    }
}
