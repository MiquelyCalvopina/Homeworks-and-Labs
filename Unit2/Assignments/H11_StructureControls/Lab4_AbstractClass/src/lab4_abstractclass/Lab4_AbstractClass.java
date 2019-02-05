/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_abstractclass;

import ec.edu.espe.lab4abstractclass.model.Animal;
import ec.edu.espe.lab4abstractclass.model.Mammal;

/**
 *
 * @author Miqui
 */
public class Lab4_AbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal;
        //animal = new Animal (); ERROR NO SE PUEDEN INSTANCIAR CLASES ABSTRACTAS
        //Si tengo clases extractas puedo crear funciones
        //Una funcion que se llame igual para ambos pero funcione diferente en cada hijo
        animal = new Mammal();
        animal.giveBirth();
        //SACAR EL TIPO DE OBJETO:
        System.out.println("Animal is a tipe of -> " + animal.getClass().getSimpleName());
        //if animal.getClass().getSimpleName() == mammal haver mammal
        //implementar clase abstracta
        //dos niveles de herencia, primero y segundo abstractos
    }
    
}
