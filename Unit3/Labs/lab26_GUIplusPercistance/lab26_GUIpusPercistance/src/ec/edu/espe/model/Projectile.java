/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import ec.edu.espe.utils.FileManager;

/**
 *
 * @author Miquely Calvopiña
 */
public class Projectile {
    private float degrees;
    private float initialVel;
    private float distance;
    private float gravity = 9.8f; 

    public float getDegrees() {
        return degrees;
    }

    public void setDegrees(float degrees) {
        this.degrees = degrees;
    }

    public float getInitialVel() {
        return initialVel;
    }

    public void setInitialVel(float initialVel) {
        this.initialVel = initialVel;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public float getGravity() {
        return gravity;
    }

    public void setGravity(float gravity) {
        this.gravity = gravity;
    }

    public boolean validateDegrees(int degree){
        boolean isRight = false;
       return isRight;
    }  
    public String calcsToString(Projectile projectile){
        String text;
        text = projectile.getDegrees()+";"+projectile.getInitialVel()+";"+projectile.getDistance()+";";
        return text;
    }
    public void saveData(){
        String text;
        FileManager file = new FileManager();
        Projectile projectile = new Projectile();
        
        file.exists("Projectile.csv");
        text = projectile.calcsToString(this);
        file.save("Projectile.csv",text);
    }
        
    public void calcDistance(){
        this.degrees = this.degrees;
        float initialVel = this.initialVel*this.initialVel;
        this.gravity = this.gravity;
        Double sen = 2*(Math.sin(this.degrees)*Math.cos(this.degrees));
        String sin = String.valueOf(sen);
        System.out.println("Grados: "+this.degrees+"; Vel: "+initialVel+"; Arg: "+sin);
        this.distance = (initialVel*Float.parseFloat(sin))/this.gravity;
        
    }
    
     
    
}
