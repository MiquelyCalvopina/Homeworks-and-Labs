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
        String data,newdata,filePath="archivo.csv";
        int year,month,day,op=1;
        int newyear,newmonth,newday;
        String name,newname;
        FileMannagement filen = new FileMannagement();
        File file = new File (filePath);
        
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
        System.out.println("DESEA MODIFICAR ALGUN DATO: SI(1) NO(0)");
        op = in.nextInt();
        do{
            
          System.out.println("INGRESE EL NOMBRE DE LA PERSONA A MODIFICAR: ");
          newname = in.nextLine();
          System.out.print("INGRESE EL AÑO DE NACIMIENTO(AAAA): ");
          newyear = in.nextInt();
          System.out.print("INGRESE EL MES DE NACIMIENTO(MM): ");
          newmonth = in.nextInt();
          System.out.print("INGRESE EL DIA DE NACIMIENTO(DD): ");
          newday = in.nextInt();
          
          if(person.validate(year, month, day)==true){
            System.out.println("Fecha erronea");
            System.out.print("INGRESE EL AÑO DE NACIMIENTO(AAAA): ");
            newyear = in.nextInt();
            System.out.print("INGRESE EL MES DE NACIMIENTO(MM): ");
            newmonth = in.nextInt();
            System.out.print("INGRESE EL DIA DE NACIMIENTO(DD): ");
            newday = in.nextInt();
          }
          person.calcAge(newyear,newmonth,newday);   
          newdata = newname + ";" + person.getAgeYear() + ";" + person.getAgeMonth() + ";" + person.getAgeDay();
          
          
          op++;
        }while(op==1);
        
        
    }
    
}
