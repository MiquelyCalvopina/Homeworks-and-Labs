/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package states;

import ec.edu.espe.states.model.amazon.Amazon;
import ec.edu.espe.states.model.amazon.Pastaza;
import ec.edu.espe.states.model.coast.Coast;
import ec.edu.espe.states.model.coast.Guayas;
import ec.edu.espe.states.model.sierra.Pichincha;
import ec.edu.espe.states.model.sierra.Sierra;

/**
 *
 * @author Miqui
 */
public class States {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Amazon amazon;
        amazon = new Pastaza();
        amazon.regionName();
        amazon.stateFair();
        
        Coast coast;
        coast = new Guayas();
        coast.regionName();
        coast.stateFair();
        
        Sierra sierra;
        sierra = new Pichincha();
        sierra.regionName();
        sierra.stateFair();
    }
    
}
