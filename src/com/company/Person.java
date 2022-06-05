package com.company;

public class Person {

    String name;
    String surname;

    Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String toString(){
        return this.name + ' ' + this.surname;
    }
}
