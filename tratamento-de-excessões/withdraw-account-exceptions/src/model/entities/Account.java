package model.entities;

import model.exceptions.withdrawException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw(Double amount){
        validateWithdraw(amount);
        balance -= amount;
    }

    public void validateWithdraw(Double amount){
        if (amount > getWithdrawLimit()) {
            throw new withdrawException("The amount exceeds withdraw limit");
        }
        if(amount > getBalance()){
            throw new withdrawException("The balance is insufficient");
        }
    }
}
