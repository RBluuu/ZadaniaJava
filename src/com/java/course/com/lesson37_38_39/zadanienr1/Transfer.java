package com.java.course.com.lesson37_38_39.zadanienr1;

import java.math.BigInteger;
import java.util.Objects;

public class Transfer {

    private Account formAccount;
    private Account onAccount;
    private BigInteger sum;

    public Transfer(Account formAccount, Account onAccount, BigInteger sum) {
        this.formAccount = formAccount;
        this.onAccount = onAccount;
        this.sum = sum;
    }

    public void transfer(Account fromAccount, Account onAccount, BigInteger sum) {
        if(fromAccount.getCurrency().equals(onAccount.getCurrency())) {
            fromAccount.getBalance().subtract(sum);
            onAccount.getBalance().add(sum);
        } else {
            System.out.println("False currency");
        }
    }

    public Account getFormAccount() {
        return formAccount;
    }

    public void setFormAccount(Account formAccount) {
        this.formAccount = formAccount;
    }

    public Account getOnAccount() {
        return onAccount;
    }

    public void setOnAccount(Account onAccount) {
        this.onAccount = onAccount;
    }

    public BigInteger getSum() {
        return sum;
    }

    public void setSum(BigInteger sum) {
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transfer transfer = (Transfer) o;
        return Objects.equals(formAccount, transfer.formAccount) && Objects.equals(onAccount, transfer.onAccount) && Objects.equals(sum, transfer.sum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formAccount, onAccount, sum);
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "formAccount=" + formAccount +
                ", onAccount=" + onAccount +
                ", sum=" + sum +
                '}';
    }
}
