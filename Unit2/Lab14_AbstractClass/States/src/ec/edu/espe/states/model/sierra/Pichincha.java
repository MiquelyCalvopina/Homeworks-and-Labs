/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.states.model.sierra;

import java.util.Scanner;

/**
 *
 * @author Miqui
 */
public class Pichincha extends Sierra{

    private String date="24 de Mayo";

    @Override
    public void regionName() {
        System.out.println("Pichincha pertenece a la Sierra");
    }

    @Override
    public void stateFair() {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Las fiestas de provincialización de Pichincha en el: " + date);
    }
    
    
}
