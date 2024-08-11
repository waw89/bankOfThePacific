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
public class Account {
       
    private Long id;
    
    private float balance; 

    private Customer customer;
    
    private Card card; 
    
    private List contacts; 
    
    private List operation; 
    
    public Account() {
    }

    public Account(Long id, float balance) {
        this.id = id;
        this.balance = balance;
    }

    public Account(float balance) {
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List getContacts() {
        return contacts;
    }

        
    private void addContact(Contact contact){
        this.contacts.add(contact);
        
    }

    public List getOperation() {
        return operation;
    }
    
    public void addOperation(Operation operation){
        this.operation.add(operation); 
    }
    
    
    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", balance=" + balance + '}';
    }
    
    
}
