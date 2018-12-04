/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12_inheritance;
import ec.edu.espe.lab14abstractclass.model.Files;
import ec.edu.espe.lab14abstractclass.model.Animal;
import ec.edu.espe.lab14abstractclass.model.Mammal;
import ec.edu.espe.lab14abstractclass.model.Reptile;
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
        int id,adquisition,nipples,op,a,b;
        String scientificName,data;
        
        Files filen = new Files();
        File file = new File("archivo.csv");
        Animal[] animal = new Animal[3]; 
        
       /* animal[0] = new Mammal(3,01,1998,"Monkey");
        animal[1] = new Mammal(4,02,2010,"Elephant");
        */
        
        for(int i=0; i<animal.length; i++){
        
            System.out.println("\tINGRESAR:");
            System.out.println("1. Mamifero");
            System.out.println("2. Reptil");
            do{ System.out.print("opcion: "); op=in.nextInt(); }while(op<1 || op>2);
            switch(op){
                case 1:
                        System.out.print("INGRESE EL NUMERO DE PEZONES: "); nipples=in.nextInt();
                        System.out.print("INGRESE EL NUMERO DE ID: "); id=in.nextInt();
                        System.out.print("INGRESE EL ANIOO DE ADQUISICION: "); adquisition=in.nextInt();
                        System.out.print("INGRESE EL NOMBRE CIENTIFICO: "); scientificName=in.nextLine();
                        in.nextLine();
                        animal[i] = new Mammal(nipples,id,adquisition,scientificName);
                        data = "N. pezones: " + ";" + nipples + ";" +
                                "ID: " + ";" + id + ";" +
                                "Anio de adquisicion: " + ";" + adquisition + ";" + 
                                "Anios de estadia: " + ";" + animal[i].getYearsOfStay() + ";" +
                                "Nombre cientifico: " + ";" + scientificName + ";";
                        filen.write(file, data);
                         System.out.println("Data guardada...");
                break;
                case 2:
                        System.out.print("INGRESE : "); a=in.nextInt();
                        System.out.print("INGRESE : "); b=in.nextInt();
                        System.out.print("INGRESE ID: "); id=in.nextInt();
                        System.out.print("INGRESE EL AÑO DE ADQUISICIÓN: "); adquisition=in.nextInt();
                        System.out.print("INGRESE EL NOMBRE CIENTÍFICO: "); scientificName=in.nextLine();
                        in.nextLine();
                        animal[i] = new Reptile(a,b,id,adquisition,scientificName);
                        data = " : " + ";" + a + ";" +
                                "ID: " + ";" + id + ";" +
                                "Año de adquisicion: " + ";" + adquisition + 
                                "Años de estadia: " + animal[i].getYearsOfStay() +
                                "Nombre cientifico: " + ";" + scientificName;
                        filen.write(file, data);
                        System.out.println("Data guardada...");
                break;
            }
           

        }

    
    }
    
}
