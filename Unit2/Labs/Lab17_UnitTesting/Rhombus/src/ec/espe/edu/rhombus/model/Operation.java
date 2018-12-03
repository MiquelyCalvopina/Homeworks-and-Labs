/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.rhombus.model;

/**
 *
 * @author Miqui
 */
public class Operation {
 
    public double perimeter(double greaterDiag, double minorDiag){
        double perimeter=0;
        
        
        if(greaterDiag>minorDiag && greaterDiag>0 && minorDiag>0){
            double x=Math.pow(minorDiag,2)+ Math.pow(greaterDiag,2);
            perimeter = 2*Math.sqrt(x);
        }else{
            if(greaterDiag<=0 || minorDiag<=0){
                perimeter = -1;
            }
            if(greaterDiag == minorDiag){
                    perimeter = -1;
            }
            if(greaterDiag<minorDiag){
                perimeter = -1;
            }
        }
     return perimeter;   
    }
    
    public double area(double minorDiag, double greaterDiag){
        double area=0;
        
        if(greaterDiag>minorDiag && greaterDiag>0 && minorDiag>0){
            area = (greaterDiag*minorDiag)/2;
        }else{
            if(greaterDiag<=0 || minorDiag<=0){
                area = -1;
            }
            if(greaterDiag == minorDiag){
                    area = -1;
            }
            if(greaterDiag<minorDiag){
                area = -1;
            }
        }
        
        return area;
    }
        
    
}
