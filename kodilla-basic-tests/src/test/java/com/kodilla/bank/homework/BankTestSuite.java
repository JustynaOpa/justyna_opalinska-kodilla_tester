package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void ShouldCalculateBillansFromAllCashMashines(){
        Bank bank = new Bank();
        bank.add(2);
        bank.bilansFromAllCM();
        System.out.println(bank.bilansFromAllCM());
        assertEquals(2, bank.bilansFromAllCM());

    }
    @Test
    public void ShouldCalculateAllNumberOfPayinTransactions(){
        Bank bank = new Bank();
        bank.add(1);
        bank.numberOfPayin();
        System.out.println(bank.numberOfPayin());
        assertEquals(4, bank.numberOfPayin());

    }
    @Test
    public void ShouldCalculateAllNumberOfPayoutTransactions(){
        Bank bank = new Bank();
        bank.add(3);
        bank.numberOfPayout();
        System.out.println(bank.numberOfPayout());
        assertEquals(6, bank.numberOfPayout());

    }
    @Test
    public void ShouldCalculateAverageOfPayinTransactions(){
        Bank bank = new Bank();
        bank.add(2);
        bank.getPayinAverage();
        System.out.println(bank.getPayinAverage());
        assertEquals(5, bank.getPayinAverage());

    }
    @Test
    public void ShouldCalculateAverageOfPayoutTransactions(){
        Bank bank = new Bank();
        bank.add(1);
        bank.getPayoutAverage();
        System.out.println(bank.getPayoutAverage());
        assertEquals(0, bank.getPayoutAverage());

    }
}
