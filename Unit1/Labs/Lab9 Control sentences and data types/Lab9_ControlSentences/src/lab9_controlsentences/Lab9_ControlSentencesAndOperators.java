/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_controlsentences;

import ec.edu.espe.lab9_controlsentences.model.Person;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Miqui
 */
public class Lab9_ControlSentencesAndOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int day,month,year;
        System.out.println("Ingrese el año de nacimiento");
        year = in.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        month = in.nextInt();
        System.out.println("Ingrese el dia de nacimiento");
        day = in.nextInt();
        
        System.out.println(calculateAge(new GregorianCalendar(year,month,day)));
        
    }
    
}
