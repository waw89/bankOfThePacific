/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankdomain;

import java.util.List;

/**
 *
 * @author waw
 */
public class Contact {
    private long id; 
    private String name; 
    private String bank; 
    private String alias; 
    private String cardNumber; 
    private boolean isSameBank; 
    private Account account; 
    private List transfers; 
    
    public Contact() {
    }

    public Contact(long id, String name, String bank, String alias, String cardNumber, boolean isSameBank) {
        this.id = id;
        this.name = name;
        this.bank = bank;
        this.alias = alias;
        this.cardNumber = cardNumber;
        this.isSameBank = isSameBank;
    }

    public Contact(String name, String bank, String alias, String cardNumber, boolean isSameBank) {
        this.name = name;
        this.bank = bank;
        this.alias = alias;
        this.cardNumber = cardNumber;
        this.isSameBank = isSameBank;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean isIsSameBank() {
        return isSameBank;
    }

    public void setIsSameBank(boolean isSameBank) {
        this.isSameBank = isSameBank;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List getTransfers() {
        return transfers;
    }
    
    public void addTransfer(Transfer transfer){
        this.transfers.add(transfer); 
        
    }
    
    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", name=" + name + ", bank=" + bank + ", alias=" + alias + ", cardNumber=" + cardNumber + ", isSameBank=" + isSameBank + '}';
    }
    
    
}
