package com.kodilla.bank.homework;

public class Bank {
    private CashMashine[] cashMashines;

    public Bank() {
        cashMashines = new CashMashine[3];

    }
    public void add(int value){

    }


    public int bilansFromAllCM(){
        int saldoSald = 0;
        for (int i =0; i< cashMashines.length; i++)
        saldoSald = saldoSald + cashMashines[i].getSaldo();

        return saldoSald;

    }
    public int numberOfPayout(){
        int sum =0;
        for(int i = 0; i< cashMashines.length; i++)
            sum = sum + cashMashines[i].numberOfPayout();
        return sum;

    }

    public int numberOfPayin(){
        int sum =0;
        for(int i = 0; i< cashMashines.length; i++)
            sum = sum + cashMashines[i].numberOfPayin();
        return sum;

    }

    public int getPayoutAverage(){
        int average =0;
        for(int i =0; i< cashMashines.length; i++)
            average = average + cashMashines[i].payoutSum();
            return average/numberOfPayout();


    }

    public int getPayinAverage(){
        int average =0;
        for(int i =0; i< cashMashines.length; i++ )
            average = average + cashMashines[i].payinSum();
        return average/numberOfPayin();


    }
}
