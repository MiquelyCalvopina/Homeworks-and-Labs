/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.h11_unittesting.model;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Miqui
 */
public class Person {
    
    private String name;
    private int birthDay,birthMonth,birthYear;
    private int ageYear,ageMonth,ageDay;
    private int currentYear,currentMonth,currentDay; 
    
    public void calcAge(int birthYear,int birthMonth,int birthDay){
        
        Calendar today = Calendar.getInstance();
        currentYear=today.get(Calendar.YEAR);
        currentMonth=today.get(Calendar.MONTH)+1;
        currentDay=today.get(Calendar.DAY_OF_MONTH);
        
        Operation operation = new Operation(0,0,0);
        
        if(currentYear == birthYear && currentMonth == birthMonth && currentDay == birthDay){
            System.out.println("LA PERSONA NACIÓ HOY!");
        }else{
          
            if(currentMonth > birthMonth){

                    ageYear = operation.subs(currentYear, birthYear);
                    if(currentDay < birthDay){
                        ageMonth = operation.subs(currentMonth, birthMonth);
                        ageMonth = operation.subs(ageMonth,1);
                        ageDay=operation.subs(31,birthDay);
                        ageDay=operation.add(ageDay, currentDay);
                    }else{
                        ageMonth = operation.subs(currentMonth, birthMonth);
                        ageDay = operation.subs(currentDay, birthDay);
                    }
            }else{
                    if(currentDay < birthDay){
                        ageYear = operation.subs(currentYear, birthYear);
                        ageYear = operation.subs(ageYear, 1);
                        ageMonth = operation.subs(currentMonth, 1);
                        if(currentMonth==1 || currentMonth==3 || currentMonth==5 || currentMonth==7 || currentMonth==8 || currentMonth==10 || currentMonth==12){
                            ageDay=operation.subs(31,birthDay);
                            ageDay=operation.add(ageDay, currentDay);
                            if(currentMonth == 2){
                                ageDay=operation.subs(28,birthDay);
                                ageDay=operation.add(ageDay, currentDay);
                            }
                        }else{
                            ageDay=operation.subs(30,birthDay);
                            ageDay=operation.add(ageDay, currentDay);
                        }

                    }else{
                    ageYear = operation.subs(currentYear, birthYear);
                    ageYear = operation.subs(ageYear, 1);
                    ageMonth = currentMonth;
                    ageDay = currentDay;
                    }
            }
            
            System.out.println("USTED TIENE: " + ageYear + " AÑOS, " + ageMonth + " MESES Y " + ageDay + " DIAS");   
            
        }
    }
    
    public String entry(){
        String data = "";
        Person person = new Person (0,0,0,0,0,0);
        boolean validation;
        
        Scanner in = new Scanner (System.in);
        
        System.out.print("INGRESE SU NOMBRE: ");
        person.setName(in.nextLine());
        
        do{
            
            int cont=0;
            do{
                
                try{
                    System.out.print("INGRESE EL AÑO DE NACIMIENTO(AAAA): ");
                    person.setBirthYear(in.nextInt());
                    cont=1;
                }catch(NumberFormatException ex){
                    cont=0;
                    System.out.println("Solo ingrese numeros");
                }
                
            }while(cont==0);
            
            cont=0;
            do{
                
                try{
                    System.out.print("INGRESE EL MES DE NACIMIENTO(MM): ");
                    person.setBirthMonth(in.nextInt());    
                    cont=1;
                }catch(NumberFormatException ex){
                    cont=0;
                }
                
            }while(cont==0);
            
            cont=0;
            do{
                
                try{
                    System.out.print("INGRESE EL DIA DE NACIMIENTO(DD): ");
                    person.setBirthDay(in.nextInt());
                    cont=1;
                }catch(NumberFormatException ex){
                    cont=0;
                }
                
            }while(cont==0);
            
            
        }while(person.validate(person.getBirthYear(),person.getBirthMonth(),person.getBirthDay())==-1);
        
        person.calcAge(person.getBirthYear(),person.getBirthMonth(),person.getBirthDay());   
        data = person.getName() + ";" + person.getAgeYear() + ";" + person.getAgeMonth() + ";" + person.getAgeDay();
        
        return data;
    }
    
    public boolean leapYear(int year){
        
        boolean leapYear;
        GregorianCalendar calendar = new GregorianCalendar();
 
        if (calendar.isLeapYear(year))
            leapYear=true;
        else
            leapYear=false;
    
    return leapYear;
    }
    
    public int validate(int year,int month, int day){
        int alert=0;
        try{
            if (year <= 0 || month <= 0 || month > 12 || day <= 0 ) {
                System.out.println("La fecha ingresada es incorrecta");
                alert=-1;            
            }
            /*if(leapYear(year)==false){
                if(day==29){
                    System.out.println("La fecha ingresada es incorrecta");
                    alert=true;
                }
            }*/
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    if(day>31){
                        System.out.println("La fecha ingresada es incorrecta");
                        alert=-1;  
                    }
                break;
                case 4: case 6: case 9: case 11:
                    if(day>30){
                        System.out.println("La fecha ingresada es incorrecta");
                        alert=-1;  
                    }
                break;
                case 2:
                    if(leapYear(year)==true){
                        if(day>29)
                            System.out.println("La fecha ingresada es incorrecta");
                            alert=-1;  
                    }
                    else{
                        if(day>28){
                            System.out.println("La fecha ingresada es incorrecta");
                            alert=-1;
                        }
                    }
                break;
            } 
        
        Calendar today = Calendar.getInstance();
        currentYear=today.get(Calendar.YEAR);
        currentMonth=today.get(Calendar.MONTH)+1;
        currentDay=today.get(Calendar.DAY_OF_MONTH);
        
        if(year>currentYear){
            System.out.println("La fecha ingresada es incorrecta, la persona aún no nace");
            alert=-1; 
        }
        
        if(year==currentYear){
            if(month>currentMonth){
                if(day>currentDay){
                    System.out.println("La fecha ingresada es incorrecta, la persona aún no nace");
                    alert=-1; 
                }
            }
        }
//        
//        if(birthYear<1700){
//                alert=true;
//        }
        }catch(NumberFormatException e){
            System.out.println("Solo dbe ingresar numeros");
            alert=-1;
        }
    return alert;
        
    }

    public Person(int birthDay, int birthMonth, int birthYear, int ageYear, int ageMonth, int ageDay) {
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ageYear = ageYear;
        this.ageMonth = ageMonth;
        this.ageDay = ageDay;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * @return the day
     */
    public int getBirthDay() {
        return birthDay;
    }
    
    /**
     * @param birthDay the day to set
     */
    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }
    
    /**
     * @return the month
     */
    public int getBirthMonth() {
        return birthMonth;
    }

    /**
     * @param birthMonth the month to set
     */
    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    /**
     * @return the year
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * @param birthYear the year to set
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
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
