/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exception;

/**
 *
 * @author Miquely Calvopi�a
 */
public class MyException extends Exception{
    
    public MyException(){ };
    
    public String ZeroDivisionException(){
        return "No existe divici�n para cero";
    }    
}
