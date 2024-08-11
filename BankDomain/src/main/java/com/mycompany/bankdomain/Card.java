/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankdomain;

import java.util.Date;

/**
 *
 * @author waw
 */
public class Card {

    private Long id;
    private Date expedition_date;
    private Date expiration_date;
    private String number;
    private int cvc;

    private Account account;

    public Card() {
    }

    public Card(Long id, Date expedition_date, Date expiration_date, String number, int cvc) {
        this.id = id;
        this.expedition_date = expedition_date;
        this.expiration_date = expiration_date;
        this.number = number;
        this.cvc = cvc;
    }

    public Card(Date expedition_date, Date expiration_date, String number, int cvc) {
        this.expedition_date = expedition_date;
        this.expiration_date = expiration_date;
        this.number = number;
        this.cvc = cvc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getExpedition_date() {
        return expedition_date;
    }

    public void setExpedition_date(Date expedition_date) {
        this.expedition_date = expedition_date;
    }

    public Date getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(Date expiration_date) {
        this.expiration_date = expiration_date;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Card{" + "id=" + id + ", expedition_date=" + expedition_date + ", expiration_date=" + expiration_date + ", number=" + number + ", cvc=" + cvc + '}';
    }

}
