
package ec.edu.espe.BarberShop.files.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Bryan Zurita
 * @author Sebastian Zuñiga
 * @author Miquely Calvopiña
 */
public class FileManager {

    /**
     * Shows whats inside a file
     * @param file file name
     * @throws FileNotFoundException in case of not found that file
     * @throws IOException file exception
     */
    public void showContent(String file) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(file);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            System.out.println(cadena);
        }
        b.close();
    }
   
    /**
     * Search a CI in a specific file
     * @param file file name
     * @param CI of the person searched
     * @return aux 
     */
   public static String searchInFile (File name,String searchPerson)
    {
        Scanner entrada;
        entrada = null;
        String linea;
        linea = "";
        String aux = null;
        boolean contains = false;
        try
        {
           
            entrada = new Scanner(name);
            while (entrada.hasNext())
            {
                linea = entrada.nextLine();
                if(linea.contains(searchPerson))
                {
                    
                    aux = linea;
                    contains = true;
                    
                }
            }
            if (!contains)
            {
                String exe = "0";
                System.out.println(searchPerson + " no se ha encontrado en el archivo");
                return exe;
            }
            entrada.close();
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.toString());
        }  
        catch (NullPointerException e) 
        {
            System.out.println(e.toString() + "No ha seleccionado ningún archivo");
        } 
        catch (Exception e) 
        {
            System.out.println(e.toString());
        } 
        return aux;
    }
    

    /**
     * Override a specific file
     * @param fNew
     * @param fOverride 
     */
    private static void overrideFIle(File fNew, File fOverride) {
        BufferedReader br;
    try{
        if(fNew.exists()){
            br = new BufferedReader(new FileReader(fNew));
            String linea;
            while((linea=br.readLine()) != null)
            {
                    writeFile(fOverride,linea+"\n");
            }
            br.close();
             
        }
        else
        {
            System.out.println("Fichero no Existe");
        }
       fNew.delete();
        fNew.delete();
        }catch(Exception e){
            System.out.println(e);
        }
   
    }
    

    private String name;
    private String text;
    
    /**
     * Creates a new file with a name given in the argument
     * @param name of the file
     */
   public static void createFile (File name)
    {
        if(!name.exists())
        {
            try
            {
                name.createNewFile();
            }
            catch(IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }
    
    /**
     * Writes in a file
     * @param name of the file
     * @param string with the data
     */
     public static void writeFile (File name,String string)
    {
        try 
        {
            FileWriter write=new FileWriter(name,true);
            BufferedWriter bw = new BufferedWriter(write);
            write.write(string);
            bw.newLine();
            write.close();
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     

    /**
     * Saves the data given in the argument in a file
     * @param name of the file
     * @param text that is going to be written in the file
     */
    public void save(String name, String text){
                File file = new File (name);
                try
                {
                    BufferedWriter bw;
                if(file.exists()){
                    bw = new BufferedWriter(new FileWriter(file,true));
                    bw.write(text);
                }else{
                    bw = new BufferedWriter(new FileWriter(file,true));
                    bw.write(text);
                    System.out.println("Datos guardados...");
                }
                bw.close();
         
                }catch (IOException e){}
                
    }



/**
 * Sets a new line in an old one
 * @param oldText override
 * @param newText new
 * @param name the fileName
 */
public void modify(String oldText, String newText ,String name)
{
     try
        {
                BufferedReader a = new BufferedReader(new FileReader(name));
                String line;
                String input = "";
                while ((line = a.readLine()) != null) 
                {
                    input = input + line + "\n";
                }
                
                input=input.replace(oldText,newText);
                FileOutputStream getText = new FileOutputStream(name);
                getText.write(input.getBytes());
                a.close();
                getText.close();
              
        }
        catch (IOException e)
        {
           System.out.println("Ocurrio un error");
        }
           
    }



      /**
     * Modify a file if it fouds the identifyCard given in the argument
     * @param fNew new file
     * @param identifyCard of the person
     * @param inText data in a string
     */
       public static void modifyFile(File fNew, String identifyCard, String inText) {
       File fOverride= new File("Override");
        overrideFIle(fNew, fOverride);
        BufferedReader br;
        try
        {
                br = new BufferedReader(new FileReader(fOverride));
                String linea;
                while((linea=br.readLine()) != null)
                {
                    if(linea.contains(identifyCard))
                    {
                        writeFile(fNew,inText);

                    }
                    else
                    {
                        writeFile(fNew,linea+"\n");
                    }
                }
                br.close();
                
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        boolean delete = fOverride.delete();
        }
 
 

    /**
     * Delete a whole file
     * @param file 
     */
     void delete (String name)
    {
        File file = new File(name);
        try
        {
            if(file.exists())
            {
                file.delete();
            }

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    /**
     * Search a word in a file and returns the data associated with that word
     * @param route
     * @param wordSearch
     * @return
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public String searchData ( String route, String wordSearch)throws FileNotFoundException,IOException{
        FileReader fileOld =new FileReader(route);
        String cad="";
        String chain;
        BufferedReader br1 = new BufferedReader(fileOld);
        while((chain = br1.readLine())!= null) {
            if(chain.indexOf(";")!= -1){
                if (chain.split(";")[0].equalsIgnoreCase(wordSearch)) {
                   JOptionPane.showMessageDialog(null,"Registro encontrado \n"+ chain);
                    cad=chain;     
                }
            }
        }
        br1.close();         
          return cad;    
    }
    
}