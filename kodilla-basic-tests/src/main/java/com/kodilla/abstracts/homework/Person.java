package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    String job;

    public Person(String firstName, int age, String job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        doctor.responsibilitiesD();
        Architect architect = new Architect();
        architect.responsibilitiesA();
        Policeman policeman = new Policeman();
        policeman.responsibilitiesP();


    }
}
