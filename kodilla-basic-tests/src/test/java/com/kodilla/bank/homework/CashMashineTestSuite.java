package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CashMashineTestSuite {

    @Test
    public void ShouldCalculateSaldoIfTransactionIsCorrect() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.addTransaction(600);
        cashMashine.addTransaction(-200);

        System.out.println(cashMashine.getSaldo());
        assertEquals(400, cashMashine.getSaldo());

    }

    @Test
    public void ShouldCalculateNumberOfTransactions() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.addTransaction(600);
        cashMashine.addTransaction(-300);

        System.out.println(cashMashine.getNumberOfTransaction());
        assertEquals(7, cashMashine.getNumberOfTransaction());
    }

    @Test
    public void ShouldCalculateNumberOfPayin() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.addTransaction(600);
        cashMashine.addTransaction(-300);

        System.out.println(cashMashine.numberOfPayin());
        assertEquals(1, cashMashine.numberOfPayin());

    }

    @Test
    public void ShouldCalculateNumberOfPayout() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.addTransaction(600);
        cashMashine.addTransaction(-300);

        cashMashine.numberOfPayout();
        System.out.println(cashMashine.numberOfPayout());
        assertEquals(1, cashMashine.numberOfPayout());

    }

    @Test
    public void ShouldCalculateSumOfPayin() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.addTransaction(600);
        cashMashine.addTransaction(-300);

        System.out.println(cashMashine.payinSum());
        assertEquals(600, cashMashine.payinSum());
    }

    @Test
    public void ShouldCalculateSumOfPayout() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.addTransaction(600);
        cashMashine.addTransaction(-300);
        cashMashine.addTransaction(-30);

        System.out.println(cashMashine.payoutSum());
        assertEquals(-330, cashMashine.payoutSum());
    }


}
