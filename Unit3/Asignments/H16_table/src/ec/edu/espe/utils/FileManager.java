
package ec.edu.espe.utils;

import ec.edu.espe.model.Customer;
import ec.edu.espe.model.Employee;
import ec.edu.espe.model.Location;
import ec.edu.espe.model.Person;
import ec.edu.espe.model.Product;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 * @author Bryan Zurita
 * @author Sebastian Zuñiga
 * @author Miquely Calvopiña
 */
public class FileManager {

    public static void saveArrayInFile(File file, ArrayList<Employee> employees) {
        String letter = "";
	try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < employees.size(); i++) {
		
                letter = employees.get(i).getIdentifyCardNumber() + ";" +
                         employees.get(i).getId() + ";" + employees.get(i).getFullName() + ";" +
                         employees.get(i).getPhoneNumber() + ";" + employees.get(i).getSalary() + ";" +
                         employees.get(i).getAddress();
		bw.write(letter);
		bw.newLine();
            }
            bw.close();
	} catch (IOException e) {
            System.out.println("an error occurred");
            System.out.println(e.getMessage());
	}
    }

    public static boolean search(String file, String request) throws FileNotFoundException, IOException {
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
     * this method allows me to read the data stored in the inventory file and save it in a product type object to make changes in the inventory
     * @param name of the file
     * @param list of products
     * @return list of products
     **/
  
    public static ArrayList<Product> loadProduct (ArrayList<Product> products, String file) {
		String codeProduct;
		String nameProduct;
		float cost;
		int stock;
		try {
			String aux;
			try (FileReader archedad = new FileReader(file)) {
				BufferedReader br = new BufferedReader(archedad);
				aux = br.readLine();
				while ((aux != null)) {
					if (aux.contains(";")) {
                                                nameProduct = aux.split(";")[1];
						codeProduct = aux.split(";")[0];						
						stock = Integer.parseInt(aux.split(";")[2]);
						cost = Float.parseFloat(aux.split(";")[3]);
						products.add(new Product(nameProduct,codeProduct, stock, cost));
					}
					aux = br.readLine();
				}
			}
		} catch (Exception e) {
			System.out.println("Se ha producido un Error de lectura");
			System.out.println(e.toString());
                        System.out.println(e.getMessage());
		}
		return products;
	}

    public static void saveInventory(String file, ArrayList<Product> product) {
		String letter = "";
               // FileManager fm=new FileManager();
			for (int k = 0; k < product.size(); k++) {
				letter = product.get(k).getName()+ ";" + product.get(k).getCode() + ";" + product.get(k).getQuantity()+";"+ product.get(k).getCost() + "\n";
				FileManager.writeFile(new File(file),letter);
			}
			
	}

    /**
     * Delete a whole file
     * @param file 
     */
     public static void delete (String name)
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
    
    public static ArrayList<Customer> createCustomerArray(ArrayList<Customer> customer, File file) {
		
		try {
			String read;
			try (FileReader archedad = new FileReader(file)) {
				BufferedReader br = new BufferedReader(archedad);
				read = br.readLine();
				while ((read != null)) {
					if (read.contains(";")) {
                                                String CI= read.split(";")[0];
                                                String FullName= read.split(";")[1];
                                                int Age =  Integer.parseInt(read.split(";")[2]);
                                                String PhoneNumber= read.split(";")[3];
                                                String Address= read.split(";")[4];
						customer.add(new Customer(CI,FullName,Age,PhoneNumber,Address));    
					}
					read = br.readLine();
				}
			}
		} catch (Exception e) {
			System.out.println("Se ha producido un Error");
			System.out.println(e.toString());
                }
		return customer;
	}
    
    public static ArrayList<Employee> readEmployee(String fileName) throws IOException{
           ArrayList<Employee> employees=new ArrayList<>();
            String line= null;
            String text;
            File file = new File (fileName);
            
            int cont=0;
             if(file.exists()){
                 try {
                     BufferedReader read = new BufferedReader(new FileReader(fileName));
                     while((line=read.readLine())!=null)
                     {
                         Employee employee = new Employee();
                         cont++;
                         StringTokenizer mistokens = new StringTokenizer(line, ";");
                         String ic = mistokens.nextToken().trim();
                         String id =  mistokens.nextToken().trim();
                         String fullName =  mistokens.nextToken().trim();
                         String age =  mistokens.nextToken().trim();
                         String phoneNumber =  mistokens.nextToken().trim();
                         String salary =  mistokens.nextToken().trim();
                         String adress =  mistokens.nextToken().trim();
                         
                         if (cont!=1)
                         {
                         employee.setIdentifyCardNumber(ic);
                         employee.setId(id);
                         employee.setFullName(fullName);
                         employee.setAge(Integer.parseInt(age));
                         employee.setPhoneNumber(phoneNumber);
                         employee.setSalary(Double.parseDouble(salary));
                         employee.setAddress(adress);
                         employees.add(employee);
                         }
                         
                    }                 
                    } catch (FileNotFoundException ex) {
                    Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Un error ha ocurrido intentelo de nuevo");
                 }

             }
        return employees;
    }
 
     public static ArrayList<Location> createLocationArray(ArrayList<Location> location, File file) {
		
		try {
			String read;
			try (FileReader archedad = new FileReader(file)) {
				BufferedReader br = new BufferedReader(archedad);
				read = br.readLine();
				while ((read != null)) {
					if (read.contains(";")) {
                                                String CI= read.split(";")[0];
                                                String FullName= read.split(";")[1];
                                                String a =  read.split(";")[2];
                                                String PhoneNumber= read.split(";")[3];
                                               
						location.add(new Location(CI,FullName,a,PhoneNumber));    
					}
					read = br.readLine();
				}
			}
		} catch (Exception e) {
			System.out.println("Se ha producido un Error");
			System.out.println(e.toString());
                }
		return location;
	}
   public static void saveArrayInFileCustomer(File file, ArrayList<Customer> customer) {
		String letter = "";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			for (int k = 0; k < customer.size(); k++) {
				letter = customer.get(k).getIdentifyCardNumber() + ";" + customer.get(k).getFullName() + ";"
						+ customer.get(k).getPhoneNumber() + ";" + customer.get(k).getAddress();
				bw.write(letter);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("Ocurrio un error");
			System.out.println(e.getMessage());
		}
	}
}

    