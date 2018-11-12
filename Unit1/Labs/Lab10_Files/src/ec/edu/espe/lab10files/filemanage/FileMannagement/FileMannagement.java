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
    }
}
