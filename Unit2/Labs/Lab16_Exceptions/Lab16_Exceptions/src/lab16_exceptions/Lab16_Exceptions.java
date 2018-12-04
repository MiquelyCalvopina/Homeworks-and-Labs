/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16_exceptions;

import ec.edu.espe.lab16exceptions.model.Animal;
import ec.edu.espe.lab16exceptions.operations.Operation;

/**
 *
 * @author Miqui
 */
public class Lab16_Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operation operation = new Operation();
        float a;
        /*
        a=operation.divide(3, 5);
        System.out.println("RESULT: " + a);
        a=operation.divide(386, 897);
        System.out.println("RESULT: " + a);
        a=operation.divide(5.8F, 1.3F);     //PARA PONER QUE ES FLOAT (num)F
        System.out.println("RESULT: " + a);
        a=operation.divide(8, 0);
        System.out.println("RESULT: " + a);
        
        a=operation.add(1.2f,2.4f);
        System.out.println("RESULT: " + a);
        a=operation.add(1.2f,2.9f);
        System.out.println("RESULT: " + a);
        a=operation.add(30000, 30000);
        a=operation.add(40000,40000);
        System.out.println("RESULT: " + a);
        a=operation.add(5,2.4f);
        System.out.println("RESULT: " + a);
        */
        Animal animal = new Animal();
        
        if(animal != null){
            System.out.println("The animal exists");
        }else{
            System.out.println("The animal doesn´t exists");
        }
        
        try{
            //1. Van las líneas a probar
            
            System.out.println("The file is running");
            System.out.println("Eyes: "+animal.eyes);
            System.out.println("The program still running");
        
        }catch(NullPointerException ex){
            //1. mensaje de error
            //2. Que es lo que quiero que el programa haga despues del error
            /*System.out.println("Stack trace: "+ex.getStackTrace());
            System.out.println("An error ocurred " + ex);
            System.out.println("The exception "+ex.getMessage());
            */
            Animal anim = new Animal();
            anim=null;
            if(anim.eyes != null){
                System.out.println("eyes:" + anim.eyes);
            }else{
                anim.eyes="Brown";
                System.out.println("eyes: "+anim.eyes);
            }
            /*if(ex.toString()=="java.lang.NullPointerException"){
                
                System.out.println("NO HAY ANIMALES CREADOS");
                
            }*/
        
        }finally{
        
            System.out.println("After exception");
        
        }
        System.out.println("This is the Barn Number of Animal: " + animal.getBarnNumber());
        Animal animal2 = new Animal();
        System.out.println("Animal2: " + animal2.getBarnNumber());
        animal.assignBarnNumber(18);
        System.out.println("Animal2: " + animal2.getBarnNumber());
        //le cambio el valor de todos los del tipo animal, no solo a animal, tambien a animal2
        
    }
    
}
