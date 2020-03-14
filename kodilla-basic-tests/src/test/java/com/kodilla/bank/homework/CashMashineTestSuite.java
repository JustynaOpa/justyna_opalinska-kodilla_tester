package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CashMashineTestSuite {

    @Test
    public void ShouldCalculateSaldoIfTransactionIsCorrect() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.add(600);
        cashMashine.add(-300);

        int values = cashMashine.getSaldo();

        cashMashine.getSaldo();
        System.out.println(cashMashine.getSaldo());
        assertEquals(600, cashMashine.getSaldo());

    }

    @Test
    public void ShouldCalculateNumberOfTransactions() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.add(600);
        cashMashine.add(-300);

        cashMashine.getNumberOfTransaction();
        System.out.println(cashMashine.getNumberOfTransaction());


    }

    @Test
    public void ShouldCalculateNumberOfPayin() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.add(600);
        cashMashine.add(-300);

        cashMashine.numberOfPayin();
        System.out.println(cashMashine.numberOfPayin());
        assertEquals(1, cashMashine.numberOfPayin());

    }

    @Test
    public void ShouldCalculateNumberOfPayout() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.add(600);
        cashMashine.add(-300);

        cashMashine.numberOfPayout();
        System.out.println(cashMashine.numberOfPayout());
        assertEquals(4, cashMashine.numberOfPayout());

    }

    @Test
    public void ShouldCalculateSumOfPayin() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.add(600);
        cashMashine.add(-300);

        cashMashine.payinSum();
        System.out.println(cashMashine.payinSum());

    }

    @Test
    public void ShouldCalculateSumOfPayout() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.add(600);
        cashMashine.add(-300);

        cashMashine.payoutSum();
        System.out.println(cashMashine.payoutSum());

    }


}
