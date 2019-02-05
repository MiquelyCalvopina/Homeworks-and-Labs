
package ec.edu.espe.model;

import ec.edu.espe.utils.FileManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Byron Condor
 * @author Bryan Zurita
 */

public class Inventory {
    private String fullName;
    
    /**
     * this method records all the data of a product, validates them and stores them inside a product type object
     * @return p
     */
    public Product registerProduct(){
        String cod= generatecode();
        boolean bandera=false;
        Scanner sc = new Scanner(System.in);
        String name;
        float cost=0;
        int quantity=0;
        System.out.println("=============================================================================");
        System.out.println("       A continuacion ingrese los datos del producto\n");
        System.out.println("=============================================================================");
        System.out.println("ingrese el nombre del producto:");
        name = sc.nextLine();
        
        do { 
         try {
        System.out.println("ingrese el precio del producto:");
        cost = sc.nextFloat();  
        bandera=true;
        } catch (Exception e) {
          System.out.println("Solo ingrese números porfavor");
          bandera=false;
          sc.nextLine();
            }
        } while (bandera==false);  
        
        do {            
            try {
        System.out.println("ingrese el numero de productos:");
        quantity = sc.nextInt();
        bandera=true;
        } catch (Exception e) {
             System.out.println("Solo ingrese números porfavor");
          bandera=false;
          sc.nextLine();
            } 
                } while (bandera==false);
        
        Product p =new Product(cod,name,quantity,cost);
        return p;
    }
    
    /**
     * Deletes a product
     * @param product 
     */
    public void deleteProduct(Product product){
        String tempOption;
        char option = 0;
        int validationChar;
        String deleteProduct;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto que desea eliminar: ");
        deleteProduct = sc.next();
        System.out.println("¿Esta seguro que desea eliminar "+deleteProduct+", con todos sus datos?");
        System.out.println("Ingrese una \"s\" si esque asistio o \"n\" si esque no");
        tempOption = sc.next();
        validationChar = tempOption.length();
        if (validationChar == 1){
            option = tempOption.charAt(0);
                switch (option) {
                    case 'S':
                    case 's':
                        //
                        //
                        // Buscar en archivo
                        // el producto
                        //
                        //
                        break;
                    case 'N':
                    case 'n':
                        System.out.println("Ha elegido no eliminar el producto"+deleteProduct);
                        break;
                    default:
                        System.out.println("Ingrese \"s\" o \"n\" verifique su ingreso y vuelva a intentarlo...");
                        break;
                }
        }else{
            System.out.println("Solo ingrese un caracter \"s\" o \"n\" por favor...");
        }
    }
    
    /**
     * calculates the price of a number of products purchased
     * @param code
     * @param num
     * @return price
     */
    public float sellProduct(String code,int num){
        
        FileManager file = new FileManager();
        String cd;
        float price=0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> list = new ArrayList<>();
        list = file.loadProduct(list,"Inventory");
        
        for (Product p : list) {
            
            if (code.equals(p.getCode())) {
                if (p.getQuantity()==0|| num>p.getQuantity()) {
                System.out.println("=============================================================================");
                System.out.println("No existen productos suficientes. \n realice un pedido al distribuidor");
                System.out.println("=============================================================================");
                price=-1;
                sc.nextLine();
                }
                else{
                p.setQuantity(p.getQuantity() - num);
                price=num*p.getCost();
                System.out.println("el precio es"+price);
                sc.nextLine();
                }
            }
        }
        if (price == 0){
            System.out.println("=============================================================================");
            System.out.println("El producto ingresado no existe en el inventario");
            System.out.println("=============================================================================");
            sc.nextLine();
        }
   return price;
}
    /**
     * add a number of products purchased to the inventory
     * @param code
     * @param num 
     */
     public void addProduct(String code,int num){
  
        FileManager file = new FileManager();
        String cd;
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> list = new ArrayList<>();
        list = file.loadProduct(list,"Inventory");
        
        for (Product p : list) {
            System.out.println("" + p.toString(p));
        }
        
        for (Product p : list) {
            
            if (code.equals(p.getCode())) {
                p.setQuantity(p.getQuantity() + num);
            }
        }
        System.out.println("=============================================================================");    
        System.out.println("El inventario ha quedado de la siguiente manera:");
        System.out.println("=============================================================================");
        System.out.println("Codigo; Nombre; Cantidad; Precio");
        System.out.println("=============================================================================");
    
        for (Product p : list) {
            System.out.println("" + p.toString(p));
            file.writeFile(new File("Inventory"),p.toString(p));
        }
    }
    
     /**
      * Generates the code of the products, concatenating "P" with a random number
      * @return code
      */
    public String generatecode(){
        //generador de numeros aleatorios
        Random generadorAleatorios = new Random();
        int numeroAleatorio = 1+generadorAleatorios.nextInt(399);
        String code= "P"+numeroAleatorio; 
       return code;
    }

   /**
     * store the data of a product in a String
     * @param p
     * @return string
     */
    public String toString (Product p){
        String string = ""+p.getCode()+";" +p.getName()+";"+p.getQuantity()+";"+p.getCost()+"\n";
        return string;
    }
   
    /**
     * Print the products present in the inventory in a matrix
     */
    public void printInventory(){
        int cont = 0;
        int num = 0;
        try {
            String chain;
            String acumtotal = "";
            FileReader readFile = new FileReader("Inventory.csv");
            BufferedReader buffer = new BufferedReader(readFile);
            System.out.println("\033[32m   ---------------------Productos --------------------------");
            String title = "CODIGO;NOMBRE;CANTIDAD;PRECIO;";
            while ((chain = buffer.readLine()) != null) {
                cont++;
                String ID = chain.split(";")[0];
                String fullName = chain.split(";")[1];
                String quantity = chain.split(";")[2];
                String price = chain.split(";")[3];
                acumtotal += ID + ";"+ fullName.toUpperCase() +";" + quantity+ ";" + price + ";";
                if (chain.split(";")[0].length() > num) {
                    num = chain.split(";")[0].length();
                }

            }

            int cont2 = -1;
            int espacios = 0;
            String[][] llenar = new String[cont][4];

            for (int i = 0; i < cont; i++) {
                for (int j = 0; j < 4; j++) {
                    cont2++;
                    if (acumtotal.split(";")[cont].length() <= num) {
                        espacios = 0;
                        espacios = (num) - acumtotal.split(";")[cont2].length();
                    }

                    llenar[i][j] = acumtotal.split(";")[cont2] + espace(espacios);
                }
            }
            for (int i = 0; i <4; i++) {
                if (title.split(";")[i].length() <= num) {
                    espacios = 0;
                    espacios = (num) - title.split(";")[i].length();
                }
                System.out.print("\033[33m" + title.split(";")[i] + espace(espacios));
            }
            System.out.println("\n");
            System.out.println("    ---------------------------------------------------------");

            for (int i = 0; i < cont; i++) {
                for (int j = 0; j < 4; j++) {
                    cont2++;
                    System.out.print(llenar[i][j]);

                }
                System.out.println("\n");
            System.out.println("    ---------------------------------------------------------");
            }
            buffer.close();
        } catch (Exception e) {
        }
    }
    
    /**
     * Saves in a String a number of spaces ordered as a parameter
     * @param esp
     * @return es
     */
    public String espace(int esp) {
        int cont = 0;
        String es = "";
        while (cont <= esp) {
            cont++;
            es += " ";
        }
        return es;
    }
}
