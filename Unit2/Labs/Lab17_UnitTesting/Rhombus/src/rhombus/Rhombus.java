/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rhombus;

import ec.espe.edu.rhombus.model.Operation;
import java.util.Scanner;

/**
 *
 * @author Miqui
 */
public class Rhombus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double dma,dme;
        System.out.println("Diagonal mayor: ");
        dma=in.nextDouble();
        System.out.println("Diagonal mayor: ");
        dme=in.nextDouble();
        
       Operation op = new Operation();
        System.out.println("area: " 
                + op.area(dme, dma));
        System.out.println("perim: "+op.perimeter(dma, dme));
    }
    
}
