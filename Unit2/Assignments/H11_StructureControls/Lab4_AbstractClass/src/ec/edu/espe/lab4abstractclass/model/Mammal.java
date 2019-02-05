/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab4abstractclass.model;

/**
 *
 * @author Miqui
 */
public class Mammal extends Animal {

    @Override //El papa tiene un metodo del mismo nombre pero cada que instancie, se usa este
    public void giveBirth() {
        System.out.println("El mamifero esta naciendo");
    }
    
}
