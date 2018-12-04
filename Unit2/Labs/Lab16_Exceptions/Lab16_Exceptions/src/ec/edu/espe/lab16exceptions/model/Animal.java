/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab16exceptions.model;

/**
 *
 * @author Miqui
 */
public class Animal {
    
    public String eyes;
    static int barnNumber=7; //todos los objetos de ese tipo comparten ese valor
    
    public void feed(){
        System.out.println("THE ANIMAL IS EATING");
    }
    
    public void assignBarnNumber(int bN){
        barnNumber = bN;
    }

    public int getBarnNumber() {
        return barnNumber;
    }
    
}   
