package com.harumamberu.constructor;

/**
 * Created by Мишка on 15.08.16.
 */
public class Person {
    private String name;
    private String surname;

    public Person(){
        this.name = "No one";
        this.surname = "";
    }

    public Person(String name){
        this();
        this.name = name;
    }

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
