package com.kodilla.bank.homework;

public class CashMashine {
    private int[] transactions;


    public CashMashine() {
        this.transactions = new int[5];

    }

    public void addTransaction(int value) { // Adds transaction with given value /value of transaction
        // tymczasowa tablica
        int[] tab = new int[transactions.length + 1];//przepisanie wartosci ze starej tablicy do nowej
        System.arraycopy(transactions, 0, tab, 0, transactions.length);// podmiana tablicy na ta ze zmieniona wiekoscia
        transactions = tab;

        transactions[transactions.length - 1] = value;// nadanie wartosci dodanej transakcji

    }

    public int getSaldo() {
        int saldo = 0;
        for (int i = 0; i < transactions.length; i++)
            saldo = transactions[i] + saldo;

        return saldo;
    }

    public int getNumberOfTransaction() { //zlicza wartości różne od zera
        int result = 0;
        for(int i = 0; i< transactions.length; i++)
            if(transactions[i] !=0)
                result++;
        return result;
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
