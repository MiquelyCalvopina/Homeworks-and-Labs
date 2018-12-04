/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab14abstractclass.model;

import java.util.Calendar;

/**
 *
 * @author CAMILA
 */
public class Animal abstract {
    private int id; 
    private int yearsOfStay,currentYear;
    private String scientificName;
    
    public void calcYearsOfStay(int arrivalYear){
         
        Calendar today = Calendar.getInstance();
        currentYear=today.get(Calendar.YEAR);
        yearsOfStay=currentYear-arrivalYear;
    }

    public Animal(int id, int arrivalYear, String scientificName) {
        this.id = id;
        this.scientificName = scientificName;
        calcYearsOfStay(arrivalYear);
    }

    public int getYearsOfStay() {
        return yearsOfStay;
    }

    public void setYearsOfStay(int yearsOfStay) {
        this.yearsOfStay = yearsOfStay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    
    
}
