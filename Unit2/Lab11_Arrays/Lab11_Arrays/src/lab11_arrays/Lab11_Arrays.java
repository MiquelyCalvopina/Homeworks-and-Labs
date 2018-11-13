/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11_arrays;

import ec.edu.espe.lab11arrays.model.Files;
import ec.edu.espe.lab11arrays.model.Person;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author CAMILA
 */
public class Lab11_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int year,month,day;
        String name,data;
        
        Person[] person = new Person[10]; 
        Files filen = new Files();
        File file = new File("archivo.csv");
        
        for(int i=0;i<person.length;i++){
        
            System.out.print("INGRESE EL NOMBRE: ");
            name = in.nextLine();
            System.out.print("INGRESE EL AÑO DE NACIMIENTO(AAAA): ");
            year = in.nextInt();
            System.out.print("INGRESE EL MES DE NACIMIENTO(MM): ");
            month = in.nextInt();
            System.out.print("INGRESE EL DIA DE NACIMIENTO(DD): ");
            day = in.nextInt();
            in.nextLine();
            
            person[i] = new Person(year,month,day);
            
            if(person[i].validate(year,month,day)==true){
            System.out.println("Fecha erronea");
            System.out.print("INGRESE EL AÑO DE NACIMIENTO(AAAA): ");
            year = in.nextInt();
            System.out.print("INGRESE EL MES DE NACIMIENTO(MM): ");
            month = in.nextInt();
            System.out.print("INGRESE EL DIA DE NACIMIENTO(DD): ");
            day = in.nextInt();
            }
           

            person[i].calcAge(year,month,day);   
            data = "Nombre:" + ";" + name + ";" + year + ";" + month + ";" + day + ";" + "edad:" + ";" + person[i].getAgeYear();
            filen.write(file, data);
            System.out.println("Data guardada...");

        }
    }
    
}
