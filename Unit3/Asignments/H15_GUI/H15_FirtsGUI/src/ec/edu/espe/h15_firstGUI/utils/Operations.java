/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.h15_firstGUI.utils;

/**
 *
 * @author sebas
 */
public class Operations {
    
double result;

    public Operations() {
    }

    public Operations(double result) {
        this.result = result;
    }
    
    public double add(double operand1, double operand2){
        result=0;
        result= operand1 + operand2;
        return result;
    }
    
    public double sub(double operand1, double operand2){
        return add(operand1, -(operand2));
    }
    public double multi(double operand1, double operand2){
        double acum=0;
        double cont=0;
        boolean check = false;
        if(operand2<0){
            operand2 = (-operand2);
            check = true;
        } 
        while(cont < operand2){
            acum=add(acum, operand1);
            cont++;
        }
        if(check) return -acum;
        else return acum;
    }
}
