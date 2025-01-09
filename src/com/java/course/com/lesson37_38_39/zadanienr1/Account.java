package com.java.course.com.lesson37_38_39.zadanienr1;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Objects;

public class Account {
    private String accountName;
    private LocalDate dateOfCreation;
    private BigInteger balance;
    private String currency;
    private Customer customer;
    private int sumOfTransfer;

    public Account(String accountName, LocalDate dateOfCreation, BigInteger balance, String currency) {
        this.accountName = accountName;
        this.dateOfCreation = dateOfCreation;
        this.balance = balance;
        this.currency = currency;
    }

    public Account addOrSubtractionMony(Account account, String operation, BigInteger balance) {
        if (operation.equals("add")) {
            Account.this.balance = this.balance.add(balance);
        } else if (operation.equals("subtraction")) {
            Account.this.balance= this.balance.subtract(balance);
        }
        return account;
    }

    //wplac- dodaje do konta kwote w danej walucie
    public BigInteger addOrSubtrationAmount(String lastName, String accountName, String currency, String operation, BigInteger balance) {
        if (Account.this.getCustomer().getLastName().equals(lastName)) {
            if (Account.this.accountName.equals(accountName)) {
                if (Account.this.currency.equals(currency)) {
                    if (operation.equals("add")) {
                        this.balance = this.balance.add(balance);
                    } else if (operation.equals("subtraction")){
                        this.balance = this.balance.subtract(balance);
                    }
                } else {
                    System.out.println("False currency");
                }
            }
        }
        return this.balance;
    }

    public int getSumOfTransfer() {
        return sumOfTransfer;
    }

    public void setSumOfTransfer(int sumOfTransfer) {
        this.sumOfTransfer = sumOfTransfer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public BigInteger getBalance() {
        return balance;
    }

    public void setBalance(BigInteger balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountName, account.accountName) && Objects.equals(dateOfCreation, account.dateOfCreation) && Objects.equals(balance, account.balance) && Objects.equals(currency, account.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountName, dateOfCreation, balance, currency);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", dateOfCreation=" + dateOfCreation +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                '}';
    }
}
