package com.example.ddd.in.practice.logic;

import lombok.Getter;

@Getter
public final class SnackMachine {

    private Money moneyInside = new Money(0, 0, 0, 0, 0, 0);
    private Money moneyInTransaction = new Money(0, 0, 0, 0, 0, 0);

    public void insertMoney(Money money) {
        moneyInTransaction = Money.sum(moneyInTransaction, money);
    }

    public void returnMoney() {

    }

    public void buySnack() {
        moneyInside = Money.sum(moneyInside, moneyInTransaction);
    }
}
