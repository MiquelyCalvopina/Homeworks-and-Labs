/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab10files.filemanage.FileMannagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Miqui
 */
public class FileMannagement {
    
    public void write(File file, String data){
        try{
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.newLine();
            bw.write(data);
            bw.close();
            
        }catch(IOException e){
            System.out.println("Ha ocurrido un error: " + e);
        }
    }  
    
    public void read(File file){
                String line = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
        }catch(IOException e){
            System.out.println("No se encontro el archivo: " + e);
        }
    }//arreglos tipos de datos prim y de obj, coger todo el objeto y gusrdar en el archivo 
    
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
}
