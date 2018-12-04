/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab15_Interfaces;

import ec.edu.espe.interfaces.Animal;
import ec.edu.espe.lasb15interfaces.model.Mammal;
import ec.edu.espe.lasb15interfaces.model.Reptile;

/**
 *
 * @author Miqui
 */
public class Lab15_Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal;
        
        animal = new Mammal();
        animal.feed();
        animal.assignHabitat();
        
        animal = new Reptile();
        animal.feed();
        animal.assignHabitat();
    }
    
}
