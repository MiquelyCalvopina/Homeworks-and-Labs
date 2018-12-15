/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab19_libreries.area;

/**
 *
 * @author Miqui
 */
public class Triangle extends Figure{
    private float height;
    private float base;

    @Override
    public float conputeArea() {
        area = (height*base)/2;
    return area;
    }

    public Triangle(float height, float base) {
        this.height = height;
        this.base = base;
    }
    
}
