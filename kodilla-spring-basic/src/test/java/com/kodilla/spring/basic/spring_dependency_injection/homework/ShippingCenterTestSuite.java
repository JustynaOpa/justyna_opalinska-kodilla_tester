package com.kodilla.spring.basic.spring_dependency_injection.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootTest
public class ShippingCenterTestSuite {


        @Test
        public void shouldCorrectSendPackage() {
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
            DeliveryService bean = context.getBean(DeliveryService.class);
            boolean result = bean.deliverPackage("Madison Avenue 25 ", 0.5);
            Assertions.assertTrue(result);
        }
        @Test
        public void shouldFailDuringSendPackage() {
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
            DeliveryService bean = context.getBean(DeliveryService.class);
            boolean result = bean.deliverPackage("Madison Avenue 25 ", 31);
            Assertions.assertFalse(result);
        }

}
