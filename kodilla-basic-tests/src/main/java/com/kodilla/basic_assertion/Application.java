package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 12;
        int b = 6;
        int potega = 2;
        double ab = 12;

        int sumResult =calculator.sum(a,b);
        boolean correct = ResultChecker.assertEquals(18, sumResult);
        if(correct){
            System.out.println("Metoda sum działa poprawnie dla liczb" + a + "i" + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb" + a + "i" + b);

        }
        int subResult = calculator.substract(a,b);
        boolean good = ResultChecker.assertEquals(6,subResult);
            if(good){
                System.out.println("Metoda substract is correct");
            }else {
                System.out.println("Metoda substract is incorrect");
            }


            double expoR = calculator.exponentiation(potega, ab);
            boolean ok = ResultChecker.assertEquals1(144, expoR);
                if (ok) {
                    System.out.println("Metoda exponentiation jest poprawna");
            }else{
                    System.out.println("Metoda exponentiation nie jest poprawna");
                }
    }
}
