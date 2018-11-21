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
public abstract class Animal  {
    
    private int id; 
    private int yearsOfStay;
    private String scientificName;

    public abstract void giveBirth();
    //solo se declara la función, es un prototipo
    //abstract: no declare objetos de esta clase o declare metodos, llamarle
    //final: 
}
