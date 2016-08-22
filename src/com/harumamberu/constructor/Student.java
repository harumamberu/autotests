package com.harumamberu.constructor;

/**
 * Created by Мишка on 15.08.16.
 */
public class Student extends Person {
    private String university;

    public Student(String name, String surname, String university){
        super(name, surname);
        this.university = university;
    }

    public  Student(String name, String university){
        super(name);
        this.university = university;
    }

    public Student(){
        university = "have not";
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void outName() {
        System.out.println("before" + getName());
        setName("changed1");
    }



    public void outSettedName() {
        System.out.println("set" + getName());
    }
}
