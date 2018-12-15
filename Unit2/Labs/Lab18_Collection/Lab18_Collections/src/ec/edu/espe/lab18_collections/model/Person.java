/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab18_collections.model;

/**
 *
 * @author Miqui
 */
public class Person {
    private int id;
    private String name;
    private float salario;

    public Person(int id, String name, float salario) {
        this.id = id;
        this.name = name;
        this.salario = salario;
    }

    @Override
    public String toString(){
        String text = "{ "+ id + ", " + name + ", " + salario + " }";
        return text;
    }
}
