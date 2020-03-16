package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {

        double avg = UsersRepository.getUsersList()
                .stream()
                .filter(value -> value.getAge() <40)
                .map(u ->u.getNumberOfPosts())
                .mapToInt(n ->n)
                .average()
                .getAsDouble();
        System.out.println(avg);

        double avg1 = UsersRepository.getUsersList()
                .stream()
                .filter(value -> value.getAge() >=40)
                .map(u ->u.getNumberOfPosts())
                .mapToInt(n ->n)
                .average()
                .getAsDouble();
        System.out.println(avg1);











    }
}
