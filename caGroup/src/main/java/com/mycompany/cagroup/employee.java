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
public abstract class employee {
    protected String name, id, dob;
    //protected String id;
    //protected String dob;

    public employee() {
        name = " ";
        id = " ";
        dob = " ";
    }
       

    public employee(String name, String id, String dob) {
        this.name = name;
        this.id = id;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    public void printDetails(){
        System.out.println("Employee Details:"+id+","+name+","+dob);
    }
    
    public String getDetails(){
        return "Employee Details: "+id+","+name+","+dob;
    }
     public abstract void computeWPay();
}

    

