package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

public class BankTestSuite {

    @Test
    public void ShouldCalculateBillansFromAllCashMashines(){
        Bank bank = new Bank();
        bank.bilansFromAllCM();
        System.out.println(bank.bilansFromAllCM());

    }
    @Test
    public void ShouldCalculateAllNumberOfPayinTransactions(){
        Bank bank = new Bank();
        bank.numberOfPayin();
        System.out.println(bank.numberOfPayin());

    }
    @Test
    public void ShouldCalculateAllNumberOfPayoutTransactions(){
        Bank bank = new Bank();
        bank.numberOfPayout();
        System.out.println(bank.numberOfPayout());

    }
    @Test
    public void ShouldCalculateAverageOfPayinTransactions(){
        Bank bank = new Bank();
        bank.getPayinAverage();
        System.out.println(bank.getPayinAverage());

    }
    @Test
    public void ShouldCalculateAverageOfPayoutTransactions(){
        Bank bank = new Bank();
        bank.getPayoutAverage();
        System.out.println(bank.getPayoutAverage());

    }
}
