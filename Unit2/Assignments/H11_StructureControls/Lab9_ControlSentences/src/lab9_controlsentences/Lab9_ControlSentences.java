/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_controlsentences;

import ec.edu.espe.lab9_controlsentences.model.Person;
import java.util.Scanner;

/**
 *
 * @author Miqui
 */
public class Lab9_ControlSentences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int year,month,day;
        
        System.out.print("INGRESE EL AÑO DE NACIMIENTO(AAAA): ");
        year = in.nextInt();
        if (year < 0) {
            System.out.println("Año erroneo");
            System.out.print("INGRESE EL AÑO DE NACIMIENTO(AAAA): ");
            year = in.nextInt();
        }
        System.out.print("INGRESE EL MES DE NACIMIENTO(MM): ");
        month = in.nextInt();
        if (month < 0 | month > 12) {
            System.out.println("Mes erroneo");
            System.out.print("INGRESE EL MES DE NACIMIENTO(MM): ");
            month = in.nextInt();
        }
        System.out.print("INGRESE EL DIA DE NACIMIENTO(DD): ");
        day = in.nextInt();
        if (day < 0 | day > 31) {
            System.out.println("Dia erroneo");
            System.out.print("INGRESE EL DIA DE NACIMIENTO(DD): ");
            day = in.nextInt();
        }
             
        Person person = new Person(year, month, day);
        person.calcAge(year,month,day);        
        
    }
    
}
