/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab11arrays.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



/**
 *
 * @author DayannaSilva
 */
public class Files{
    
    
    public void write(File file, String inString){
        try{
            BufferedWriter buffWriter = new BufferedWriter(
                    new FileWriter(file, true));
            buffWriter.newLine();
            buffWriter.write(inString);
            buffWriter.close();
            
        }catch(IOException e){
            System.out.println("No existe el archivo o"
                    + " ha ocurrido un error");
        }
    }  
    
    public void readFile(File file){
                String line = "";
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        }catch(IOException e){
            System.out.println("No se encontro el archivo");
        }
    }
    public ArrayList<String> read(File file){
        ArrayList<String> line = new ArrayList<String>();
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            int i =0;
            line.add("");
            while(line.get(i) != null){
                line.add(reader.readLine());
                i++;
            }
            reader.close();
        }catch(IOException e){
            System.out.println("No se encontro el archivo");
        }
        return line;
    }
    
    
    public void modifyFile(File file, String name, String inString, boolean check){
        ArrayList<String> line = new ArrayList<String>();
        line = read(file);
        
        if(check){
            for (int i = 0; i < line.size()-1; i++)
                if(line.get(i).contains(name))
                    line.set(i, inString);
        }else{
            for (int i = 0; i < line.size()-1; i++)
                if(line.get(i).contains(name))
                    line.remove(i);
        }  
        try{
            
            BufferedWriter buffWriter = new BufferedWriter(
                    new FileWriter(file));
            for(int i = 1; i < line.size()-1; i++){
                buffWriter.write(line.get(i));
                buffWriter.newLine();
            }
            buffWriter.close();
            
        }catch(IOException e){
            System.out.println("No se encontro el archivo o"
                    + " ha ocurrido un error fatal :)");
        }
    }
    
    public void deleteFile(File file, String name){
        modifyFile(file, name, null, false);
    }

    public Files() {
    }
   
    
}
