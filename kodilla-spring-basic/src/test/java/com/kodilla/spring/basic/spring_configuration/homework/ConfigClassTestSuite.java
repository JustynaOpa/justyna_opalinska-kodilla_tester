package com.kodilla.spring.basic.spring_configuration.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;


@SpringBootTest
public class ConfigClassTestSuite {

    @Test
    public void shouldMatchCarToSeason() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("matchCarToSeason");
        //when
        String result = car.getTypeCar();
        //then
        Assertions.assertEquals("Sedan",result);
    }
    @Test
    public void shouldPutTheLightsOnInDeclaredHours(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("matchCarToSeason");
        //when
        boolean result = car.hasHeadlightsTurnedOn();
        //then
        if (LocalTime.now().isAfter(LocalTime.of(19,59,59)) && LocalTime.now().isBefore(LocalTime.of(6,00,00))){
            Assertions.assertTrue(result);
        } else
            Assertions.assertFalse(result);


    }
}
