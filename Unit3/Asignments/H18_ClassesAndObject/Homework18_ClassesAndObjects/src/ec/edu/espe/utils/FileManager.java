/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

import homework_ClassesAndObjects.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miquely Calvopiña
 */
public class FileManager {
    
    private String pass = "contra";
    
    public void save(String fileName, String text)
    {
        try
        {
             File file=new File(fileName);
               if (!file.exists()) {
                   file.createNewFile();
                 }
             FileWriter wr=new FileWriter(file.getAbsoluteFile(),true);
             BufferedWriter bw = new BufferedWriter(wr);
             wr.write(text+"\n");
             wr.close();
             bw.close();
        } catch (IOException e)  {
          System.out.println("ERROR: No se pudo escribir en el archivo");
        }
       
    }
    
    public boolean search(String fileName, String request)
    {

        File file =new File(fileName);
          if (!file.exists()) {
            return false;
          }
      try {    
          BufferedReader rd = new BufferedReader(new FileReader(fileName));
          String line = "";
          
          while((line = rd.readLine())!= null){
              if(line.indexOf(request)!= -1){
                   rd.close();
                    return true;
                 } 
        
            }
             rd.close();
        }catch (Exception e) {
             e.printStackTrace();  }
            return false;
    }
    
    public void exists(String fileName)
    { 
        File file =new File(fileName);

        if(fileName=="Informacion.csv" || fileName.equals("Informacion.csv"))
            {
               if (!file.exists()) {
                  String text;
                  text="Apellido;SalarioxHora;Horas;Total;IESS;Ganancia;";
                   this.save(fileName,text);
                  return;
             }
            }
        
        if(fileName=="Data.csv" || fileName.equals("Data.csv"))
            {
               if (!file.exists()) {
                  String text;
                  text="Apellido;SalarioxHora;Horas;";
                   this.save(fileName,text);
                  return;
             }
            }
        if(fileName=="Calculos.csv" || fileName.equals("Calculos.csv"))
            {
               if (!file.exists()) {
                  String text;
                  text="Total;IESS;Ganancia;";
                   this.save(fileName,text);
                  return;
             }
            }
        if(fileName=="UserPassword.txt" || fileName.equals("UserPassword.txt"))
            {
               if (!file.exists()) {
                  String text;
                  text=pass;
                   this.save(fileName,text);
                  return;
             }
            }
        
    }
        
    public ArrayList<User> readUser(String fileName) throws IOException{
           ArrayList<User> users=new ArrayList<>();
            String line= null;
            String text;
            File file = new File (fileName);
            
            int cont=0;
             if(file.exists()){
                 try {
                     BufferedReader read = new BufferedReader(new FileReader(fileName));
                     while((line=read.readLine())!=null)
                     {
                         User user= new User();
                         cont++;
                         StringTokenizer mistokens = new StringTokenizer(line, ";");
                         String surname= mistokens.nextToken().trim();
                         String salary =  mistokens.nextToken().trim();
                         String hour =  mistokens.nextToken().trim();
                         String totalSalary =  mistokens.nextToken().trim();
                         String iess =  mistokens.nextToken().trim();
                         String liquid =  mistokens.nextToken().trim();

                         if (cont!=1)
                         {
                         user.setLastName(surname);
                         user.setSalary(Float.parseFloat(salary));
                         user.setHour(Integer.parseInt(hour));
                         user.setTotalAmount(Float.parseFloat(totalSalary));
                         user.setIess(Float.parseFloat(iess));
                         user.setRevenue(Float.parseFloat(liquid));
                         users.add(user);
                         }
                         
                    }                 
                    } catch (FileNotFoundException ex) {
                    Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Un error ha ocurrido intentelo de nuevo");
                 }

             }
return users;
    }

         
    
    
    
    
 
    
    
    
    
    
    
    
    
}
