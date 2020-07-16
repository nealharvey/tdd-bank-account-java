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
    @Disabled
    public void depositAnAmountToIncreaseTheBalance() {
        assertThat("your first test").isBlank();
    }
}
