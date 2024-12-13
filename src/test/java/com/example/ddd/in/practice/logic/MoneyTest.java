package com.example.ddd.in.practice.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    void sum_of_two_moneys_produces_correct_result() {
        Money money1 = new Money(1, 2, 3, 4, 5, 6);
        Money money2 = new Money(1, 2, 3, 4, 5, 6);
        Money sum = Money.sum(money1, money2);
        Money expected = new Money(2, 4, 6, 8, 10, 12);

        Assertions.assertEquals(2, sum.getOneCentCount());
        Assertions.assertEquals(expected, sum);
        Assertions.assertEquals(4, sum.getTenCentCount());
        Assertions.assertEquals(6, sum.getQuarterCount());
        Assertions.assertEquals(8, sum.getOneDollarCount());
        Assertions.assertEquals(10, sum.getFiveDollarCount());
        Assertions.assertEquals(12, sum.getTwentyDollarCount());
    }

    @Test
    void two_money_instances_are_equal_if_contain_the_same_money_amount() {
        Money money1 = new Money(1, 2, 3, 4, 5, 6);
        Money money2 = new Money(1, 2, 3, 4, 5, 6);

        Assertions.assertTrue(money1.equals(money2));
        Assertions.assertEquals(money1.hashCode(), money2.hashCode());
    }

    @Test
    void two_money_instances_are_not_equal_if_contain_different_money_amount() {
        Money money1 = new Money(1, 2, 3, 4, 5, 6);
        Money money2 = new Money(1, 2, 3, 4, 5, 7);

        Assertions.assertNotEquals(money1, money2);
        Assertions.assertNotEquals(money1.hashCode(), money2.hashCode());
    }
}
