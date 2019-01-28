/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.control;

import ec.edu.espe.utils.FileManager;

/**
 *
 * @author Miquely Calvopiña
 */
public class Product {
    private String id;
    private String name;
    private float price;
    private float percent;
    private float pvp;

    public String dataToString(Product product){
        String text;
        text = product.getId()+";"+product.getName()+";"+product.getPrice()+";"+product.getPercent()+";"+product.getPvp()+";";
        return text;
    }
    
    public void saveData(){
        String text;
        FileManager file = new FileManager();
        Product product = new Product();
        
        file.exists("Productos.csv");
        text = product.dataToString(this);
        file.save("Productos.csv",text);
    }
    
    public void calcPVP(){
        this.price = this.price;
        this.percent = this.percent/100;
        this.pvp = this.price+this.percent;      
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPercent() {
        return percent;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    public float getPvp() {
        return pvp;
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }
    
    
    
}
