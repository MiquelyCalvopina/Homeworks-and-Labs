/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab18_collections;

import ec.edu.espe.lab18_collections.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Miqui
 */
public class Lab18_Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Collection things = new ArrayList();
        Person person = new Person(1,"Miquely",3000);
        
        //TAMAÑO DE LA COLECCION
        System.out.println("Size at the beginning: " + things.size());
    
        //AÑADIR COSAS
        things.add(18000);
        things.add("Hello Quito");
        things.add(5000.25f);
        things.add(person);
        
        //Ya que se han añadido 4 cosas, su nuevo tamaño es 4
        System.out.println("Size at the end: " + things.size());
    
        //Imprimir lista
        System.out.println("The elements are: " + things); //es necesario un override en el objeto
        
        Object[] thingArray = new Object[things.size()];
        thingArray = things.toArray();
        System.out.println("Elements of the array: " + thingArray[2]);
    
        things.remove(5000.25f);
        System.out.println("Size at the end: " + things.size());
        System.out.println("Elements of the array: " + things);
        
        things.add(3);
        things.add(3);
        things.add(3);
        System.out.println("Size at the end: " + things.size());
        System.out.println("Elements of the array: " + things);
        
        things.remove(3);
        System.out.println("Size at the end: " + things.size());
        System.out.println("Elements of the array: " + things);
        
        things.add(5);
        things.add(8);
        things.add(4);
        things.add(8);
        things.add(9);
        things.add(8);
        System.out.println("Size at the end: " + things.size());
        System.out.println("Elements of the array: " + things);
        things.remove(8);
        System.out.println("Size at the end: " + things.size());
        System.out.println("Elements of the array: " + things);
        things.remove(person);
        System.out.println("Size at the end: " + things.size());
        System.out.println("Elements of the array: " + things);
        
        //Collection de intergers
        Collection<Integer> integers = new ArrayList<>();
        integers.add(1);
         //crear lista de personas de 1 a 5
         //nombre steven1, steven2,...,steven5
         //salario 1000,2000,...,5000
        
        Collection<Person> persons = new ArrayList<>();
       
        
        for(int i=1; i<=5;i++){
            persons.add(new Person(i, "Miquely"+i,i*1000));
        }
        
        for(Person per: persons){
             System.out.println("Person: "+ per);
        }
    }   
    
}
