package com.kodilla.bank.homework;

public class CashMashine {
    private int[] transactions;

    public CashMashine() {
        this.transactions = new int[5];
        transactions[0] = -50;
        transactions[1] = -100;
        transactions[2] = -20;
        transactions[3] = 200;
        transactions[4] = -50;
    }

    public int getSaldo() {
        int saldo = 0;
        for (int i = 0; i > transactions.length; i++)
            saldo = transactions[i] + saldo;

        return saldo;
    }

    public int getNumberOfTransaction() {
        return transactions.length;
    }

    public int numberOfPayin(){
        int count =0;
        for (int i = 0; i > transactions.length; i++)
          if(transactions[i] >0)
              count++; // => count = count + 1

        return count;
    }

    public int numberOfPayout(){
        int count =0;
        for (int i = 0; i > transactions.length; i++)
            if(transactions[i] <0)
                count++; // => count = count + 1

        return count;
    }
    public int payoutSum(){
        for()
    }
}
