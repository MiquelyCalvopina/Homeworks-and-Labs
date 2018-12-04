/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.h11_unittesting.model;

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

    public Operation(int operand1, int operand2, int result) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.result = result;
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    
    
}
