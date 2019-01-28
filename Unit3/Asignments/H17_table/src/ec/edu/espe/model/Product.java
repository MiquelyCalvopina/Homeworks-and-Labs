
package ec.edu.espe.model;


import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Byron Condor
 */
public class Product {
    
    private String name;
    private String code;
    private int quantity;
    private float cost;
    
    public Product() {
    }

    public String getName() {
        return name;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public String getCode() {
        return code;
    }     

    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * Store the data of a product in a String
     * @param p
     * @return string 
     */
    public String toString (Product p){
        String string = ""+p.code+";" +p.name.toUpperCase()+";"+p.quantity+";"+p.cost+"\n";
        return string;
    }
     public Product(String code,String name, int quantity, float cost) {
        this.code = code;
         this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }     

 
 }