package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int numberOne = 12;
        int numberTwo = 6;
        int potega = 2;
        double a = 12;

        int sumResult =calculator.addition(numberOne,numberTwo);
        boolean correct = ResultChecker.assertEquals(18, sumResult);
        if(correct){
            System.out.println("Metoda addition działa poprawnie dla liczb" + numberOne + "i" + numberTwo);
        } else {
            System.out.println("Metoda addition nie działa poprawnie dla liczb" + numberOne + "i" + numberTwo);

        }
        int subResult = calculator.substraction(numberOne,numberTwo);
        boolean good = ResultChecker.assertEquals(6,subResult);
            if(good){
                System.out.println("Metoda substraction is correct");
            }else {
                System.out.println("Metoda substraction is incorrect");
            }


            double expoR = calculator.exponentiation(potega, a);
            boolean ok = ResultChecker.assertEquals1(144, expoR);
                if (ok) {
                    System.out.println("Metoda exponentiation jest poprawna");
            }else{
                    System.out.println("Metoda exponentiation nie jest poprawna");
                }
    }
}
