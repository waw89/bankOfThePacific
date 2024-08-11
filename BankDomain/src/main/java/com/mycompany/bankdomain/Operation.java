/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankdomain;

/**
 *
 * @author waw
 */
public class Operation {

    protected long id;
    protected String description;
    protected float ammount;
    protected Account account;

    public Operation() {
    }

    public Operation(long id, String description, float ammount) {
        this.id = id;
        this.description = description;
        this.ammount = ammount;
    }

    public Operation(String description, float ammount, Account account) {
        this.description = description;
        this.ammount = ammount;
        this.account = account; 
    }

    

}
