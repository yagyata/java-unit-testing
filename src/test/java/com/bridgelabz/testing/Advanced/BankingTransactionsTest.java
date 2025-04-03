package com.bridgelabz.testing.Advanced;

import com.bridgelabz.junit.Advanced.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankingTransactionsTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(4000);
    }

    @Test
    void depositTest(){
        account.deposit(4500);
        assertEquals(8500, account.getBalance(), 0.0001);
    }

    @Test
    void withdrawTest() {
        account.withdraw(1000);
        assertEquals(3000, account.getBalance(), 0.0001);
    }

    @Test
    void withdrawInsufficientFundsTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(5000);
        });
    }
}
