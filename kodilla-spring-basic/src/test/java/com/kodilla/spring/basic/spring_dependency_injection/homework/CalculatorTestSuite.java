package com.kodilla.spring.basic.spring_dependency_injection.homework;



import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldReturnSumOfElements() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.add(15,3);
        Assertions.assertEquals(18,result);
    }
    @Test
    public void shouldReturnSubstractOfElements() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.subtract(15,3);
        Assertions.assertEquals(12,result);
    }
    @Test
    public void shouldReturnMultiplyOfElements() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.multiply(15,3);
        Assertions.assertEquals(45,result);
    }
    @Test
    public void shouldReturnDivideOfElements() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(15,3);
        Assertions.assertEquals(5,result);
    }


}
