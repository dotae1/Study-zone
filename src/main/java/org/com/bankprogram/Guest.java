package org.com.bankprogram;

public class Guest {
    private final BankSystem bankSystem = new BankSystem();

    public void in() {
            bankSystem.in();
    }
    public void out() {
        bankSystem.out();
    }
    public void give() {
        bankSystem.give();
    }
    public void bankcheck() {
        bankSystem.bankcheck();
    }
}
