/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankbusiness;

import com.mycompany.bankdomain.Customer;
import dtos.RegisterNewUserDTO;
import java.util.Date;

/**
 *
 * @author waw
 */
public class UserBusiness {
    Customer customer; 
    public void registerNewUser(RegisterNewUserDTO registerDTO){
        customer = new Customer(registerDTO.getFirstName(), registerDTO.getLastName(), new Date(), registerDTO.getAddressLine1()+registerDTO.getAddressLine2(), registerDTO.getCountryIdentifier(), registerDTO.getEmail(), registerDTO.getPassword()); 
        
    }
    
}
