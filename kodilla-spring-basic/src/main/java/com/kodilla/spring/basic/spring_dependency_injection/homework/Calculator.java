package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;
    double a = 15;
    double b = 3;

    public Calculator (Display display) {
        this.display = display;
    }
    public double add(double a, double b){
        double sum = a + b;
        return this.display.display(sum);

    }
    public double subtract(double a, double b){
        double sub = a - b;
        return this.display.display(sub);
    }
    public double multiply(double a, double b){
        double multi = a*b;
        return this.display.display(multi);
    }
    public double divide(double a, double b){
        double div = a/b;
        return this.display.display(div);
    }
}

