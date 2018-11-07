/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab9_controlsentences.model;

import java.util.Calendar;


/**
 *
 * @author Miqui
 */
public class Person {
    private int bornDay,bornMonth,bornYear;
    private int ageYear,ageMonth,ageDay;
    private int actualYear,actualMonth,actualDay; 
    
    public int calculateAge (Calendar bornDate){
        
        Calendar today = Calendar.getInstance();
        
        Operation operation = new Operation();
        actualYear=today.get(Calendar.YEAR);
        actualMonth=today.get(Calendar.MONTH);
        actualDay=today.get(Calendar.DAY_OF_MONTH);
        
        ageYear = operation.subs(actualYear,bornDate.get(Calendar.YEAR));
        ageMonth = operation.subs(actualMonth,bornDate.get(Calendar.MONTH));
        ageDay = operation.subs(actualDay,bornDate.get(Calendar.DAY_OF_MONTH));        
       
        if(ageMonth < 0 || (ageMonth==0 && ageDay<0)){
            ageYear--;
        }
        return ageYear;
    }

    public Person(int day, int month, int year) {
        this.bornDay = day;
        this.bornMonth = month;
        this.bornYear = year;
    }
    
    /**
     * @return the day
     */
    public int getBornDay() {
        return bornDay;
    }

    /**
     * @return the month
     */
    public int getBornMonth() {
        return bornMonth;
    }

    /**
     * @param bornMonth the month to set
     */
    public void setBornMonth(int bornMonth) {
        this.bornMonth = bornMonth;
    }

    /**
     * @return the year
     */
    public int getBornYear() {
        return bornYear;
    }

    /**
     * @param bornYear the year to set
     */
    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }

    /**
     * @return the ageYear
     */
    public int getAgeYear() {
        return ageYear;
    }

    /**
     * @param ageYear the ageYear to set
     */
    public void setAgeYear(int ageYear) {
        this.ageYear = ageYear;
    }

    /**
     * @return the ageMonth
     */
    public int getAgeMonth() {
        return ageMonth;
    }

    /**
     * @param ageMonth the ageMonth to set
     */
    public void setAgeMonth(int ageMonth) {
        this.ageMonth = ageMonth;
    }

    /**
     * @return the ageDay
     */
    public int getAgeDay() {
        return ageDay;
    }

    /**
     * @param ageDay the ageDay to set
     */
    public void setAgeDay(int ageDay) {
        this.ageDay = ageDay;
    }
    
    
}
