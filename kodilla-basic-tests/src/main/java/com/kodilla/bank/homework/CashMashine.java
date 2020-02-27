package com.kodilla.bank.homework;

public class CashMashine {
    private int[] transactions;

    public CashMashine(){
        this.transactions = new int[5];
        transactions[0] = -50;
        transactions[1] = -100;
        transactions[2] = -20;
        transactions[3] = 200;
        transactions[4] = -50;
    }

    public int getSaldo (){
        int account = 4850;
        int saldo = account - transactions[i];
        for(int i =account; i > 0; i++)

        return saldo;
    }
    public int getNumberOfTransaction(){
        int sum = 0;
        for(int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        return sum;
    }

}
