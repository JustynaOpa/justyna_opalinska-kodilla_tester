package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.time.MonthDay;

@Configuration
public class ConfigClass {

    private MonthDay cabrio = MonthDay.now();
    private MonthDay suv = MonthDay.now();

    @Bean
    public Car matchCarToSeason(){
        Car car;
        if (cabrio.isAfter(MonthDay.of(6,22)) && cabrio.isBefore(MonthDay.of(9,23))){
            car = new Cabrio();

        } else if (suv.isAfter(MonthDay.of(12,21)) && suv.isBefore(MonthDay.of(3,20))){
            car = new SUV();

        } else {
            car = new Sedan();
        }

        return car;
    }
}
