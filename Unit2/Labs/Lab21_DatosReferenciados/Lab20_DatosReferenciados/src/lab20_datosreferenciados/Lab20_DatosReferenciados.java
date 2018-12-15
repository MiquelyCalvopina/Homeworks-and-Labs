/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab20_datosreferenciados;

import ec.edu.espe.lab20_datosrefenciados.controler.SalesPrice;

/**
 *
 * @author Miquely Calvopiña
 */

public class Lab20_DatosReferenciados {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        float tax = 12;
        float base = 0;
        float finalPrice = 0;
        base=10;
        
        SalesPrice salesPrice;
        salesPrice = new SalesPrice(20,10,0);
        System.out.println("Printing SalesPrice from main -> "+salesPrice);
        
        
        computeFinalPrice(base,tax,finalPrice);
        System.out.println("Printing from main -> base = "+base+" Final Price ="+finalPrice);
        
        mcomputeFinalPrice(salesPrice);
        System.out.println("Printing from mcomputeFinalPrice ->"+salesPrice);
        
        Integer prueba = new Integer(10);
        System.out.println("Printing Integer from main -> "+ prueba);
        
        modifyInteger(prueba);
        System.out.println("Printing Integer from main -> " + prueba);
        
    }
    
    public static void computeFinalPrice(float mbase,float mtax,float mfinalPrice){
        mfinalPrice=(mbase*mtax/100)+mbase;
        System.out.println("Printing from compute -> base = "+mbase+" Final Price ="+mfinalPrice);
    }
    
    public static void mcomputeFinalPrice(SalesPrice msellsPrice){
        msellsPrice.setFinalPrice((msellsPrice.getBase()*msellsPrice.getTax()/100)+msellsPrice.getBase());
        System.out.println("Printing from mconputeFinalPrice ->"+msellsPrice);
    }
    
    public static void modifyInteger(Integer integer){
        integer = integer * integer;
        System.out.println("Printing Integer from modifyInteger -> " + integer);
    }
}
