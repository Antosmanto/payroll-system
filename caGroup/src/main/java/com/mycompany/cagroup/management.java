/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cagroup;

/**
 *
 * @author Antoinette M. bolger
 */
public class management extends employee {
    private double salary;
    private double weeklyPay;

    public management() {
        super();
        salary = 0.0;
        weeklyPay = 0.0;
    }

    public management(double salary, String name, String id, String dob) {
        super(name, id, dob);
        this.salary = salary;
    }
    
    

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String getDetails(){
        return super.getDetails()+","+salary;
    }
    
    @Override
    public void computeWPay(){
        weeklyPay = salary/52;
    }

    public double getWeeklyPay() {
        return weeklyPay;
    }
    
}

    
    

