/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h11_unittesting;

import ec.edu.espe.h11_unittesting.filemannagment.FileMannagment;
import ec.edu.espe.h11_unittesting.model.Operation;
import ec.edu.espe.h11_unittesting.model.Person;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Miqui
 */
public class H11_UnitTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Scanner in = new Scanner (System.in);
        
        String data,newdata;
        String option,option2;
        int elected,elected2,result;
        
        try{
        FileMannagment filen = new FileMannagment();
        File file = new File ("archivo.csv");
        
        Person person = new Person(0,0,0,0,0,0);
        Operation operation= new Operation(0,0,0);
        
        System.out.println("    MENU    ");
        System.out.println("1. Fechas de nacimiento");
        System.out.println("2. Operaciones");
        
        option=in.nextLine();
        elected=Integer.parseInt(option);
        
        switch(elected){
            
            case 1:
                data=person.entry();
                filen.write(file, data);
                System.out.println("Data guardada...");
                System.out.println("DESEA MODIFICAR ALGÚN DATO?");
                System.out.println("1. Si");
                System.out.println("2. No");
                do{
                
                    option2=in.nextLine();
                    elected2=Integer.parseInt(option);
                    
                    System.out.print("INGRESE EL NOMBRE DE LA PERSONA A MODIFICAR: ");
                    data=in.nextLine();
                    newdata=person.entry();
                    filen.read(file);
                    filen.modify(file, data, newdata, true);
                    
                    elected2++;
                }while(elected2==1);
            break;
            
            case 2:
                
                int num1=0;
                int num2=0;
                int cont=0;
                
                do{
                    try
                    {
                        System.out.print("INGRESE EL PRIMER NUMERO: ");
                        num1 = in.nextInt();
                        cont=1;
                    }catch(Exception ex){
                        cont=0;
                    }
                }while(cont==0);
                
                cont=0;
                do{
                    try
                    {
                        System.out.print("INGRESE EL SEGUNDO NUMERO: ");
                        num2 = in.nextInt();
                        cont=1;
                    }catch(Exception ex){
                        cont=0;
                    }
                }while(cont==0);
               
            
            result=operation.add(num1, num2);
            System.out.println(num1 + " + " + num2 +" = " + result);
            result=operation.subs(num1, num2);
            System.out.println(num1 + " - " + num2 +" = " + result);
            result=operation.mult(num1, num2);
            System.out.println(num1 + " * " + num2 +" = " + result);
            result=operation.div(num1, num2);
            System.out.println(num1 + " / " + num2 +" = " + result);
            
            break;
            
            default:
                System.out.println("Elección incorrecta");
           
        }
        
        }catch(Exception ex){
            System.out.println("END OF PROGRAM");
    }
    

    }
    
}

