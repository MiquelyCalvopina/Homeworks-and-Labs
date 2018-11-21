/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lasb15interfaces.model;

import ec.edu.espe.interfaces.Animal;

/**
 *
 * @author Miqui
 */
public class Reptile implements Animal {

    @Override
    public void feed() {
        System.out.println("FEEDING A REPTILE WITH INSECTS AND MEAT");
    }

    @Override
    public void assignHabitat() {
        System.out.println("A CAGE IS ASSIGNED TO REPTIL");
    }
    
}
