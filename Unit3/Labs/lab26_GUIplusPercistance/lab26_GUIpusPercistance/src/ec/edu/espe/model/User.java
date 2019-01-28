/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import ec.edu.espe.utils.FileManager;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Miquely Calvopiña
 */
public class User {
    String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    public String dataToString(User user){
        String text;
        text = user.getUser();
        return text;
    }
    
    
    public void saveData(){
        String text;
        FileManager file = new FileManager();
        User projectile = new User();
        
        file.exists("Usuarios.txt");
        text = projectile.dataToString(this);
        file.save("Usuarios.txt",text);
    }
 
    public boolean search(String file, String request) throws FileNotFoundException, IOException
    {

        String string;
        boolean contains = false;
        FileReader f = new FileReader(file);
        BufferedReader b = new BufferedReader(f);
        
        while((string = b.readLine())!=null) {
            String parts[] = string.split(";");
            String ic = parts[0];
            if(ic.equals(request)){
                System.out.println("buscado: "+request+";encontrado: "+ic);
                contains = true;
            }
        }
        b.close();

    return contains;
        
    }
}
