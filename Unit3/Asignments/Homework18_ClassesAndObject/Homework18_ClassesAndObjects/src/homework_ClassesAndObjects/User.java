/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_ClassesAndObjects;

import ec.edu.espe.utils.FileManager;

/**
 *
 * @author Miquely Calvopiña
 */
public class User {
    
    private String lastName;
    private int hour;
    private float salary;
    private float totalAmount;
    private float iess;
    private float revenue;
        
    public String calcsToString(User user){
        String text;
        text=user.getTotalAmount()+";"+user.getIess()+";"+user.getRevenue()+";";
        return text;
    }

    public String infoToString(User user){
        String text;
        text=user.getLastName()+";"+user.getSalary()+";"+user.getHour()+";"+user.getTotalAmount()+";"+user.getIess()+";"+user.getRevenue()+";";
        return text;
    }    
    
    public String dataToString(User user){
        String text;
        text=user.getLastName()+";"+user.getSalary()+";"+user.getHour()+";";
        return text;
    }
    
    public void saveData(){
        String text;
        FileManager file = new FileManager();
        User user = new User();
        
        file.exists("Data.csv");
        text = user.dataToString(this);
        file.save("Data.csv",text);
    }
        
    public void saveCalcs(){
        String text;
        FileManager file = new FileManager();
        User user = new User();
        
        file.exists("Calculos.csv");
        text = user.calcsToString(this);
        file.save("Calculos.csv",text);    
    }
        
    public void saveInfo(){
        String text;
        FileManager file =new FileManager();
        User user = new User();
        
        file.exists("Informacion.csv");
        text = user.infoToString(this);
        file.save("Informacion.csv",text);
    }
        
    public void calcSalary(){
        this.totalAmount=this.salary*this.hour;
        this.iess=this.totalAmount*0.0945f;
        this.revenue=this.totalAmount-this.iess;      
    }
        
    public User() {    
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public float getIess() {
        return iess;
    }

    public void setIess(float iess) {
        this.iess = iess;
    }

    public float getRevenue() {
        return revenue;
    }

    public void setRevenue(float revenue) {
        this.revenue = revenue;
    }




        
        
        
       
        
}
