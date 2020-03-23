package com.kodilla.bank.homework;

public class CashMashine {
    private int[] transactions;


    public CashMashine() {
        this.transactions = new int[5];

    }
    public void add(int value){
        int[] tab = new int[transactions.length + value];
        System.arraycopy(transactions, 0, tab, 0, transactions.length);

    }

    public int getSaldo() {
        int saldo = 0;
        for (int i = 0; i < transactions.length; i++)
            saldo = transactions[i] + saldo;

        return saldo;
    }

    public int getNumberOfTransaction() {
        return transactions.length;
    }

    public int numberOfPayin() {
        int count = 0;
        for (int i = 0; i < transactions.length; i++)
            if (transactions[i] > 0)
                count++; // => count = count + 1

        return count;
    }

    public int numberOfPayout() {
        int count = 0;
        for (int i = 0; i < transactions.length; i++)
            if (transactions[i] < 0)
                count++; // => count = count + 1

        return count;
    }

    public int payoutSum() {
        int summ = 0;
        for (int i = 0; i < transactions.length; i++)
            if (transactions[i] < 0)
            summ = summ + transactions[i];

        return summ;

    }

    public int payinSum() {
        int summ = 0;
        for (int i = 0; i < transactions.length; i++)
            if (transactions[i] > 0)
            summ = summ + transactions[i];

        return summ;

    }
}
