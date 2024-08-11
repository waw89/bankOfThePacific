/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankdomain;

import java.util.Date;
import java.util.List;

/**
 *
 * @author waw
 */
public class Customer {
    
    private Long id;
    private String firstName; 
    private String lastName; 
    private Date birth_date; 
    private String address;
    private String countryId;
    private String email; 
    private String password;
    private List accounts; 
    
    
    public Customer() {
    }

    public Customer(Long id, String firstName, String lastName, Date birth_date, String address, String countryId, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth_date = birth_date;
        this.address = address;
        this.countryId = countryId;
        this.email = email;
        this.password = password;
    }

    public Customer(String firstName, String lastName, Date birth_date, String address, String countryId, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth_date = birth_date;
        this.address = address;
        this.countryId = countryId;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List getAccounts() {
        return accounts;
    }

    public void setAccounts(List accounts) {
        this.accounts = accounts;
    }

    private void addAccount(Account account){
        this.accounts.add(account);
    }
    
    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birth_date=" + birth_date + ", address=" + address + ", countryId=" + countryId + ", email=" + email + ", password=" + password + '}';
    }
    
    
    
    
    
}
