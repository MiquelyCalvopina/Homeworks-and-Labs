/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab14abstractclass.model;

/**
 *
 * @author CAMILA
 */
public class Reptile extends Animal {
    private int a;
    private int b;

    public Reptile(int a, int b, int id, int arrivalYear, String scientificName) {
        super(id, arrivalYear, scientificName);
        this.a = a;
        this.b = b;
    }
    
   
}
