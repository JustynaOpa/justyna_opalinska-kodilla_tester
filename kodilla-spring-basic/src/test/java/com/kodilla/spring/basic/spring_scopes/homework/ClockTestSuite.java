package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ClockTestSuite {

    @Test
    public void shouldCreateDifferentTime() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        Clock time1 = context.getBean(Clock.class);
        Clock time2 = context.getBean(Clock.class);
        Clock time3 = context.getBean(Clock.class);

        Assertions.assertNotEquals(time1, time2);
        Assertions.assertNotEquals(time1, time3);
        Assertions.assertNotEquals(time3, time2);
    }
}
