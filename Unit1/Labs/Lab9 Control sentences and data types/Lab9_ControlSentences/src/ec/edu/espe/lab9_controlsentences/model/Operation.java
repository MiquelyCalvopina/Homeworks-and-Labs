/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab9_controlsentences.model;

/**
 *
 * @author Miqui
 */
public class Operation {
    private int operand1;
    private int operand2;
    private int result;
    
    public int add(int operand1,int operand2){
     result=operand1+operand2;
     return result;
    }
    public int subs(int operand1,int operand2){
     result=add(operand1,-(operand2));
     return result;
    }
    public int mult(int operand1,int operand2){
     int cont=0;
     int acum=0;
        if(operand2<0){
            operand2=-(operand2);
        }
        while(cont<operand2){
            acum=add(acum,operand1);
            cont++;
        }
     return acum;
    }
    public int div(int operand1,int operand2){
     int cont=0;
     while(operand1>=operand2){
      operand1=add(operand1,-(operand2));
      cont++;
     }
     return cont;
    }
    
}
