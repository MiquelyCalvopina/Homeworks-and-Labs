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
    private int borny;
    private int bornm;
    private int bornd;
    
    Calendar cal=Calendar.getInstance();
    private int actualyear=cal.get(Calendar.YEAR);
    private int actualmonth=cal.get(Calendar.MONTH);
    private int actualday=cal.get(Calendar.DAY_OF_MONTH);
    
    private int year;
    private int month;
    private int day;
    
}
