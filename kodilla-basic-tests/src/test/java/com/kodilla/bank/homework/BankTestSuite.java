package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void ShouldCalculateBillansFromAllCashMashines(){
        Bank bank = new Bank();
        bank.add(600);
        bank.bilansFromAllCM();
        System.out.println(bank.bilansFromAllCM());
        assertEquals(600, bank.bilansFromAllCM());

    }
    @Test
    public void ShouldCalculateAllNumberOfPayinTransactions(){
        Bank bank = new Bank();
        bank.numberOfPayin();
        System.out.println(bank.numberOfPayin());
        assertEquals(0, bank.numberOfPayin());

    }
    @Test
    public void ShouldCalculateAllNumberOfPayoutTransactions(){
        Bank bank = new Bank();
        bank.numberOfPayout();
        System.out.println(bank.numberOfPayout());
        assertEquals(0, bank.numberOfPayout());

    }
    @Test
    public void ShouldCalculateAverageOfPayinTransactions(){
        Bank bank = new Bank();
        bank.getPayinAverage();
        System.out.println(bank.getPayinAverage());
        assertEquals(0, bank.getPayinAverage());

    }
    @Test
    public void ShouldCalculateAverageOfPayoutTransactions(){
        Bank bank = new Bank();
        bank.getPayoutAverage();
        System.out.println(bank.getPayoutAverage());
        assertEquals(0, bank.getPayoutAverage());

    }
}
