package com.example.ddd.in.practice.logic;

import lombok.Getter;

@Getter
public final class SnackMachine {

    private Money moneyInside = new Money(0, 0, 0, 0, 0, 0);

    private int oneCentCountInTransaction;
    private int tenCentCountInTransaction;
    private int quarterCountInTransaction;
    private int oneDollarCountInTransaction;
    private int fiveDollarCountInTransaction;
    private int twentyDollarCountInTransaction;

    public void insertMoney(
            int oneCentCount,
            int tenCentCount,
            int quarterCount,
            int oneDollarCount,
            int fiveDollarCount,
            int twentyDollarCount) {
        this.oneCentCountInTransaction += oneCentCount;
        this.tenCentCountInTransaction += tenCentCount;
        this.quarterCountInTransaction += quarterCount;
        this.oneDollarCountInTransaction += oneDollarCount;
        this.fiveDollarCountInTransaction += fiveDollarCount;
        this.twentyDollarCountInTransaction += twentyDollarCount;
    }

    public void returnMoney() {
        oneCentCountInTransaction = 0;
        tenCentCountInTransaction = 0;
        quarterCountInTransaction = 0;
        oneDollarCountInTransaction = 0;
        fiveDollarCountInTransaction = 0;
        twentyDollarCountInTransaction = 0;
    }

    public void buySnack() {
        oneCentCount += oneCentCountInTransaction;
        tenCentCount += tenCentCountInTransaction;
        quarterCount += quarterCountInTransaction;
        oneDollarCount += oneDollarCountInTransaction;
        fiveDollarCount += fiveDollarCountInTransaction;
        twentyDollarCount += twentyDollarCountInTransaction;

        oneCentCountInTransaction = 0;
        tenCentCountInTransaction = 0;
        quarterCountInTransaction = 0;
        oneDollarCountInTransaction = 0;
        fiveDollarCountInTransaction = 0;
        twentyDollarCountInTransaction = 0;
    }
}
