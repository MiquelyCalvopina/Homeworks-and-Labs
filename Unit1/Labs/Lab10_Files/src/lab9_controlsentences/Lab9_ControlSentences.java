/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_controlsentences;

import ec.edu.espe.lab10files.filemanage.FileMannagement.FileMannagement;
import ec.edu.espe.lab9_controlsentences.model.Person;
import java.io.File;
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
        String data;
        int year,month,day;
        String name;
        FileMannagement filen = new FileMannagement();
        File file = new File ("archivo.csv");
        
        System.out.print("INGRESE SU NOMBRE: ");
        name = in.nextLine();
        System.out.print("INGRESE EL AÑO DE NACIMIENTO(AAAA): ");
        year = in.nextInt();
        System.out.print("INGRESE EL MES DE NACIMIENTO(MM): ");
        month = in.nextInt();
        System.out.print("INGRESE EL DIA DE NACIMIENTO(DD): ");
        day = in.nextInt();
        
        Person person = new Person(year, month, day);
        
        if(person.validate(year, month, day)==true){
        System.out.println("Fecha erronea");
        System.out.print("INGRESE EL AÑO DE NACIMIENTO(AAAA): ");
        year = in.nextInt();
        System.out.print("INGRESE EL MES DE NACIMIENTO(MM): ");
        month = in.nextInt();
        System.out.print("INGRESE EL DIA DE NACIMIENTO(DD): ");
        day = in.nextInt();
        }
       
        person.calcAge(year,month,day);   
        data = name + ";" + person.getAgeYear() + ";" + person.getAgeMonth() + ";" + person.getAgeDay();
        filen.write(file, data);
        System.out.println("Data guardada...");
        filen.read(file);
    }
    
}
