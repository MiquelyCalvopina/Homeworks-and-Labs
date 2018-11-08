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
    
    public void calcAge(int bornYear,int bornMonth,int bornDay){
        
        Calendar today = Calendar.getInstance();
        
        Operation operation = new Operation();
        actualYear=today.get(Calendar.YEAR);
        actualMonth=today.get(Calendar.MONTH)+1;
        actualDay=today.get(Calendar.DAY_OF_MONTH);
        
        if(actualMonth > bornMonth){
            
                ageYear = operation.subs(actualYear, bornYear);
                if(actualDay < bornDay){
                    ageMonth = operation.subs(actualMonth, bornMonth);
                    ageMonth = operation.subs(ageMonth,1);
                    ageDay=operation.subs(31,bornDay);
                    ageDay=operation.add(ageDay, actualDay);
                }else{
                    ageMonth = operation.subs(actualMonth, bornMonth);
                    ageDay = operation.subs(actualDay, bornDay);
                }
        }else{
                ageYear = operation.subs(actualYear, bornYear);
                ageYear = operation.subs(ageYear, 1);
                ageMonth = actualMonth;
                ageDay = actualDay;
        }
        
        if(ageYear < 0){
            System.out.println("LA PERSONA AÚN NO HA NACIDO");
        }else{
            System.out.println("USTED TIENE: " + ageYear + " AÑOS, " + ageMonth + " MESES Y " + ageDay + " DIAS");   
        }
    }
    
    public Person(int year, int month, int day) {
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
