/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankdomain;

/**
 *
 * @author waw
 */
public class Transfer extends Operation {
    private Long id; 
    private String bankOfDestination; 
    private String cardNumber; 
    private Contact contact; 
    
    
    public Transfer(Long id, String bankOfDestination, String cardNumber, String description, float ammount, Contact contact, Account account) {
        super(description, ammount, account);
        this.id = id;
        this.bankOfDestination = bankOfDestination;
        this.cardNumber = cardNumber;
        this.contact = contact; 
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBankOfDestination() {
        return bankOfDestination;
    }

    public void setBankOfDestination(String bankOfDestination) {
        this.bankOfDestination = bankOfDestination;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getAmmount() {
        return ammount;
    }

    public void setAmmount(float ammount) {
        this.ammount = ammount;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Transfer{" + "id=" + id + ", bankOfDestination=" + bankOfDestination + ", cardNumber=" + cardNumber + '}';
    }
    
    
    
    
}
