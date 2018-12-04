/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.states.model.amazon;

import java.util.Scanner;

/**
 *
 * @author Miqui
 */
public class Pastaza extends Amazon {
    private String date="10 de Noviembre";

    @Override
    public void regionName() {
        System.out.println("Pastaza pertenece a la Amazonia");
    }

    @Override
    public void stateFair() {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Las fiestas de provincialización de Pastaza en el: " + date);
    }
    
    
    
}
