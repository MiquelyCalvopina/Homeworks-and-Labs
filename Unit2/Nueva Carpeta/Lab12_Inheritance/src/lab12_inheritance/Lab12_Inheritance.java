/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12_inheritance;
import ec.edu.espe.lab12inheritance.model.Files;
import ec.edu.espe.lab12inheritance.model.Animal;
import ec.edu.espe.lab12inheritance.model.Mammal;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author CAMILA
 */
public class Lab12_Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Animal animal;
        //animal = new Mammal(2,3,1998,20,"Mammal"); //parametros nipples,id,adquisition,yearsofstay,scientific name
        //animal( , , ){ sds=afa; afafa=afdaf; afaf=asfadf; asfs=calcyearsofstay( , );}
        //arreglo mamiferos y reptiles, calcular años de estadia, todos los archivos y reptiles en un archivo
        Scanner in = new Scanner (System.in);
        int id,adquisition,nipples;
        String scientificName,data;
        
        Files filen = new Files();
        File file = new File("archivo.csv");
        Animal[] animal = null; 
        
        animal[0] = new Mammal(3,01,1998,"Monkey");
        animal[1] = new Mammal(4,02,2010,"Elephant");
        
        
        /*for(int i=0;i<animal.length;i++){
        
            
            //person[i] = new Person(year,month,day);
            
            
            //person[i].calcAge(year,month,day);   
            //data = "Nombre:" + ";" + name + ";" + year + ";" + month + ";" + day + ";" + "edad:" + ";" + person[i].getAgeYear();
            filen.write(file, data);
            System.out.println("Data guardada...");

        }*/

    
    }
    
}
