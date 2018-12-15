/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab19_consuminglibreries;

import ec.edu.espe.lab19_libreries.area.Figure;
import ec.edu.espe.lab19_libreries.area.Triangle;
import ec.edu.espe.lab19_libreries.operation.BasicOperartion;

/**
 *
 * @author Miqui
 */
public class Lab19_ConsumingLibreries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Figure figure = new Triangle(1,2);
        BasicOperartion basicOp = new BasicOperartion(1.2f,2.4f);
        
        float localArea;
        localArea = figure.conputeArea();
        System.out.println("The area of the triangule is: "+localArea);
    
        float localResult;
        localResult = basicOp.add();
        System.out.println("The add is: " + localResult);
        
        localResult = basicOp.subtract();
        System.out.println("The substract: " + localResult);
        
        localResult = basicOp.multiply();
        System.out.println("The multiply: " + localResult);
        
        localResult = basicOp.divide();
        System.out.println("The divide: " + localResult);
    }
    
}
