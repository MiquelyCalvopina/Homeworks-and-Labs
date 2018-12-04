/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab11arrays.model;

import java.util.Calendar;

/**
 *
 * @author CAMILA
 */
public class Person {
    private int bornDay,bornMonth,bornYear;
    private int ageYear;
    private int actualYear,actualMonth,actualDay; 
    
    public void calcAge(int bornYear,int bornMonth,int bornDay){
        
        Calendar today = Calendar.getInstance();
        
        actualYear=today.get(Calendar.YEAR);
        actualMonth=today.get(Calendar.MONTH)+1;
        actualDay=today.get(Calendar.DAY_OF_MONTH);
        
        if(actualYear == bornYear && actualMonth == bornMonth && actualDay == bornDay){
            System.out.println("LA PERSONA NACIÓ HOY!");
        }else{
          
            if(actualMonth > bornMonth){

                    ageYear = actualYear - bornYear;
                    
            }else{
                    if(actualDay < bornDay){
                        ageYear = actualYear - bornYear;
                        ageYear = ageYear - 1;
                        
                    }else{
                    ageYear = actualYear - bornYear;
                    ageYear = ageYear - 1;
                    }
            }

            if(ageYear < 0){
                System.out.println("LA PERSONA AÚN NO HA NACIDO");
            }else{
                System.out.println("USTED TIENE: " + ageYear + " AÑOS");   
            }
        }
    }
    
    public boolean validate(int year,int month, int day){
        boolean alert=false;
            if (year < 0 || month < 0 | month > 12 || day < 0 | day > 31) {
                alert=true;            
            }
        return alert;
    }

    public Person(int bornDay, int bornMonth, int bornYear) {
        this.bornDay = bornDay;
        this.bornMonth = bornMonth;
        this.bornYear = bornYear;
       
    }
    
    
    
    public int getAgeYear() {
        return ageYear;
    }

    public void setAgeYear(int ageYear) {
        this.ageYear = ageYear;
    }
    
    
}
