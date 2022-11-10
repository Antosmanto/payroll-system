/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cagroup;

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Antoinette M. bolger
 */
public class StartApp {
    private static ArrayList <employee> employees;

    public static void main(String[] args) {
        GUIPayroll myGUI = new GUIPayroll();
        myGUI.setVisible(true);
        menu();
    }

    public StartApp() {
         employees = new ArrayList<>();
    }
    

    private static void menu() {
        while (true) {//start while loop
            int ans = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Add \n 2. Deleate \n 3. Show \n 4. Save\n 5. log out"));
            switch (ans) {
                case 1:
                    add();
                    break;
                case 2:
                    deleate();
                    break;
                case 3:
                    show();
                    break;
                case 4:
                    save();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showInputDialog(null, "incorrect choice try again");
                    break;
            }//end switch
        }//end while loop
    }//end menu

    private static void add() {
        int type = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like to add a 1. Manager or 2. Co-Worker?"));
        if (type == 1) {
            management m = new management();
            m.setName(JOptionPane.showInputDialog(null, "Enter name"));
            m.setDob(JOptionPane.showInputDialog(null, "Enter DOB"));
            m.setId(JOptionPane.showInputDialog(null, "Enter ID"));
            m.setSalary(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Salary")));

            employees.add(m);
        }else{
            coWorker c = new coWorker();
            c.setName(JOptionPane.showInputDialog(null, "Enter name"));
            c.setDob(JOptionPane.showInputDialog(null, "Enter DOB"));
            c.setId(JOptionPane.showInputDialog(null, "Enter ID"));
            c.setHourlyRate(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Hourly Rate")));
            c.setHours(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter hours")));
            employees.add(c);
        }
        

    }//end add

    private static void deleate() {
        if (employees.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Sorry, there are no employees to delete");
        } 
        else {
            String searchTerm = JOptionPane.showInputDialog(null, "Enter an id to search for.");
            for(int i = 0; i < employees.size();i++){
                if(employees.get(i).getId().equals(searchTerm)){
                    employees.remove(employees.get(i));
                }
                break;
            }
        }
    }//end deteate

    private static void save() {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("/c:/sudoku" + employees + ".txt"));
            for (int i = 0; i < employees.size(); i++) {
            employee e = employees.get(i);
            writer.write(e.getDetails());
            }
            writer.close();
            
        }catch(IOException e){
            throw new IllegalArgumentException("Unable to save " + employees, e);          
            
        }

    }//end save

    private static void show() {
         for (int i = 0; i < employees.size(); i++) {
            employee e = employees.get(i);
            JOptionPane.showMessageDialog(null, e.getDetails());
        }

    }//end show

}//end class
