package com.kodilla.bank.homework;

public class Bank {
    public CashMashine[] getCashMashines() {
        return cashMashines;
    }

    private CashMashine[] cashMashines;


    public Bank() {
        cashMashines = new CashMashine[3];
        for (int i = 0; i < cashMashines.length; i++) {
            cashMashines[i] = new CashMashine();
        }
    }


    public void addCashMachine(int value) { //Adds cash machines to the bank/value number cash machines to add
        CashMashine[] table = new CashMashine[cashMashines.length + value];
        System.arraycopy(cashMashines, 0, table, 0, cashMashines.length);
        cashMashines = table;
        for (int i = 0; i < value; i++) {
            cashMashines[cashMashines.length - 1 - i] = new CashMashine();
        }

    }


    public int bilansFromAllCM() {
        int saldoSald = 0;
        for (int i = 0; i < cashMashines.length; i++)
            saldoSald = saldoSald + cashMashines[i].getSaldo();

        return saldoSald;

    }

    public int numberOfPayout() {
        int sum = 0;
        for (int i = 0; i < cashMashines.length; i++)
            sum = sum + cashMashines[i].numberOfPayout();
        return sum;

    }

    public int numberOfPayin() {
        int sum = 0;

        for (int i = 0; i < cashMashines.length; i++)
            sum = sum + cashMashines[i].numberOfPayin();
        return sum;

    }

    public int getPayoutAverage() {
        int average = 0;
        for (int i = 0; i < cashMashines.length; i++)
            average = average + cashMashines[i].payoutSum();
        return average / numberOfPayout();


    }

    public int getPayinAverage() {
        int average = 0;
        for (int i = 0; i < cashMashines.length; i++)
            average = average + cashMashines[i].payinSum();
        return average / numberOfPayin();


    }
}
