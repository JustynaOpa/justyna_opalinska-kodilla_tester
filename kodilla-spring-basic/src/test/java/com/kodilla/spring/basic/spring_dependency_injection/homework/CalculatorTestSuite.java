package com.kodilla.spring.basic.spring_dependency_injection.homework;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {
    double a;
    double b;

    @Test
    public void shouldReturnSumOfElements() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.add(a,b);
        Assertions.assertEquals(a+b,result);
    }
    @Test
    public void shouldReturnSubstractOfElements() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.subtract(a,b);
        Assertions.assertEquals(a-b,result);
    }
    @Test
    public void shouldReturnMultiplyOfElements() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.multiply(a,b);
        Assertions.assertEquals(a*b,result);
    }
    @Test
    public void shouldReturnDivideOfElements() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(a,b);
        Assertions.assertEquals(a/b,result);
    }


}
