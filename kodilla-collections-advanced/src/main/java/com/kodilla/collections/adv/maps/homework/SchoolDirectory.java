package com.kodilla.collections.adv.maps.homework;


import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> directory = new HashMap<>();

        Principal edward = new Principal("Edward Man", "Brooklyn");
        Principal bob = new Principal("Bob Dylan", "California");
        Principal dough = new Principal("Dough Smith", "Florida");

        School edwardClasses = new School(24,25,27,22,26,30);
        School bobClasses = new School(19,21,24,23,20,22);
        School doughClasses = new School(25,26,24,22,28,31);

        directory.put(edward, edwardClasses);
        directory.put(bob, bobClasses);
        directory.put(dough, doughClasses);

        for(Map.Entry<Principal, School> info : directory.entrySet())
            System.out.println("School " + info.getKey().getSchoolName() + " have " +
                    info.getValue().getSummary()
                    + " students, name of principal " + info.getKey().getName());






    }
}
