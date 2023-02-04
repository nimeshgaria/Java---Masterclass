package com.company.Section6;

public class Account {
    private String number;
    private double balance;
    private String customername;
    private String customerEmailAddress;
    private String customerPhoneNumber;


    public Account(){
        this("123", 5543,"nim", "inos@gmail.com","2343489843");
        System.out.println("Empty constructor called");
    }
    public Account(String number, double balance,String customername, String customerEmailAddress, String customerPhoneNumber)
    {
        System.out.println("Constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customername = customername;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;

    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of amount " +depositAmount + " made. New balance : " +this.balance );
    }
    public void withdrawl(double withdrawlAmount){
        if(this.balance - withdrawlAmount < 0){
            System.out.println("Only " +this.balance + " available. Not processed");
        }
        else {
            this.balance -= withdrawlAmount;
            System.out.println("Withdrawl of " +withdrawlAmount+ " processed. Balance : " +this.balance);
        }
    }
    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(){
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
