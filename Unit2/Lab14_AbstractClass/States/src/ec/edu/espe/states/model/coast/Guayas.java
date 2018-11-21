/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.states.model.coast;

import java.util.Scanner;

/**
 *
 * @author Miqui
 */
public class Guayas extends Coast{

    private String date="05 de Noviembre";

    @Override
    public void regionName() {
        System.out.println("Guayas pertenece a la Costa");
    }

    @Override
    public void stateFair() {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Las fiestas de provincialización de Guayas en el: " + date);
    }
    
    
}
