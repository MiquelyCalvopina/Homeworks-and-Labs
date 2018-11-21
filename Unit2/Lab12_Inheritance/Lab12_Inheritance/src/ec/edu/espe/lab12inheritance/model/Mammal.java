/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab12inheritance.model;

/**
 *
 * @author CAMILA
 */
public class Mammal extends Animal{
    private int numberOfNipples;

    public Mammal(int numberOfNipples, int id, int arrivalYear, String scientificName) {
        super(id, arrivalYear, scientificName);
        this.numberOfNipples = numberOfNipples;
    }
    
    
    
 }
