package com.java.course.com.lesson37_38_39.zadanienr1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customerList;
    private List<Transfer> transferList;

    public Bank() {
        customerList = new ArrayList<>();
        transferList = new ArrayList<>();
    }

    public void addCustumer(Customer customer) {
        customerList.add(customer);
    }

    public void transfer(Account fromAccount, Account onAccount, BigInteger sum) {
        if(fromAccount.getCurrency().equals(onAccount.getCurrency())) {
            fromAccount.setBalance(fromAccount.getBalance().subtract(sum));
            onAccount.getBalance().add(sum);
        } else {
            System.out.println("False currency");
        }
    }




}
