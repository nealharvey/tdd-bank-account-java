package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class AccountTest {

    @Test
    public void newAccountIsZero() {
        Account testAcc = new Account();
        assertThat(testAcc.balance).isEqualTo(0);
    }

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account testAcc = new Account();
        testAcc.deposit(10);
        assertThat(testAcc.balance).isEqualTo(10);
    }

    @Test
    public void withdrawAnAmountToDecreaseTheBalance() {
        Account testAcc = new Account();
        testAcc.deposit(10);
        testAcc.withdraw(5);
        assertThat(testAcc.balance).isEqualTo(5);
    }

    @Test
    public void transferAnAmountToDecreaseTheOriginBalanceAndIncreaseTheDestinationBalance() {
        Account testAccOrigin = new Account();
        Account testAccDestination = new Account();
        testAccOrigin.deposit(10);
        testAccOrigin.transfer(4, testAccDestination);
        assertThat(testAccOrigin.balance).isEqualTo(6);
        assertThat(testAccDestination.balance).isEqualTo(4);
    }

}
