package com.mkacunha.javadeepcode;

public class Main {

    public static void main(String[] args) {
        System.out.println("APP Started");

        new PersonService().save(new Person(1, "Name"));

        System.out.println("APP Ended");
    }
}
