/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab16exceptions.operations;

/**
 *
 * @author Miqui
 */
public class Operation {
   
    public float divide(float dividend, float divider){
        float cotient=dividend/divider;
        return cotient;
        
    }
    
    public short add(short op1, short op2){
        short result=(short) (op1+op2);
        return result;
    }    
    
    public float add(float op1, float op2){
        float result=op1+op2;
        return result;
    }
    
    public Operation() {
       
    }
    
    
}
