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
        
        Animal animal = null;
        System.out.println(animal.eyes);
        
    }
    
}
