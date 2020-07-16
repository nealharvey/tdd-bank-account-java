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

}
