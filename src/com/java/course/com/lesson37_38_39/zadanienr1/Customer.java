package com.java.course.com.lesson37_38_39.zadanienr1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Customer {
    private String firstName;
    private String lastName;
    private BigInteger personalIdentificationNumber;
    private List<Account> accountList = new ArrayList<>();

    public Customer(String firstName, String lastName, BigInteger personalIdentificationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalIdentificationNumber = personalIdentificationNumber;

    }
    public void addAccount(Account account) {
        if (account == null || account.getCustomer() != null) {
            return;
        }
        account.setCustomer(this);
        this.getAccountList().add(account);
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigInteger getpersonalIdentificationNumber() {
        return personalIdentificationNumber;
    }

    public void setpersonalIdentificationNumber(BigInteger personalIdentificationNumber) {
        this.personalIdentificationNumber = personalIdentificationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(personalIdentificationNumber, customer.personalIdentificationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, personalIdentificationNumber);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personalIdentyficatorNumber=" + personalIdentificationNumber +
                '}';
    }
}
