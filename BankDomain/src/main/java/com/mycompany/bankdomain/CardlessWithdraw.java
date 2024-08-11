/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankdomain;

import java.time.LocalTime;

/**
 *
 * @author waw
 */
public class CardlessWithdraw extends Operation{
    private Long id; 
    private String code; 
    private LocalTime hourOfGeneration;
    private LocalTime hourOfEnd;
    private boolean finished; 
    private boolean completed; 

    public CardlessWithdraw() {
    }

    public CardlessWithdraw(Long id, String code, LocalTime hourOfGeneration, LocalTime hourOfEnd, boolean finished, boolean completed, String description, float ammount, Account account) {
        super(description, ammount, account);
        this.id = id;
        this.code = code;
        this.hourOfGeneration = hourOfGeneration;
        this.hourOfEnd = hourOfEnd;
        this.finished = finished;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalTime getHourOfGeneration() {
        return hourOfGeneration;
    }

    public void setHourOfGeneration(LocalTime hourOfGeneration) {
        this.hourOfGeneration = hourOfGeneration;
    }

    public LocalTime getHourOfEnd() {
        return hourOfEnd;
    }

    public void setHourOfEnd(LocalTime hourOfEnd) {
        this.hourOfEnd = hourOfEnd;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }



    @Override
    public String toString() {
        return "CardlessWithdraw{" + "id=" + id + ", code=" + code + ", hourOfGeneration=" + hourOfGeneration + ", hourOfEnd=" + hourOfEnd + ", finished=" + finished + ", completed=" + completed + '}';
    }
    
    
    
}
