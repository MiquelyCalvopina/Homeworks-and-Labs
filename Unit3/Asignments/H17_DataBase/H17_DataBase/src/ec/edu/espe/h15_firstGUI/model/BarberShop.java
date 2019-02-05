
package ec.edu.espe.h15_firstGUI.model;


import ec.edu.espe.h15_firstGUI.utils.FileManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Byron Condor
 * @author Bryan Zurita
 * @author Sebas Zuñiga
 */
public class BarberShop {
    public String fullName = "GLADY'S PELUQUERIA";
    private final String phoneNumber = "0994286668";
    private double earning;
    private double expense;
    FileManager file=new FileManager();
    Scanner dataInput = new Scanner(System.in);
    
    private static BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
    
    /**
     * This method receives an employee and creates a string that stores the data of it, to record in a file 
     * @param employee a person
     * @throws IOException a file exception
     */
    public int newEmployee(String dataInput) throws IOException{
        String auxString;
        List<String> dataSplit = Arrays.asList(dataInput.split(";"));
        auxString = searchEmployee(dataSplit.get(0));
        if(auxString == "0")
        {
            FileManager.writeFile(new File("Empleados.csv"), dataInput);
            return 0;
        }
        else
        {
            List<String> dataSplit2 = Arrays.asList(auxString.split(";"));
            if (((String) dataSplit.get(0)).equals((String) (dataSplit2.get(0)))) {
                return 0;
            } else {
                FileManager.writeFile(new File("Empleados.csv"), dataInput);
                return 1;
            }
        }
    }
    
    
    
    /**
     * This method receives the ID from an employee to verify 
     * if it already exists in the employee file, if it exists, the method returns that employee's data
     * @param identifyCard of a person
     * @return aux 
     */    
    public String searchEmployee(String identifyCard){
        String aux;
        aux = FileManager.searchInFile(new File("Empleados.csv"), identifyCard);
        return aux;
    }
    
    /**
     * This method edits the data of a searched employee by his identify card
     * @param employee a person
     * @param identificationCard of a employee
     * @throws IOException a file exception
     */
    public void modifyEmployee(Employee employee, String identificationCard) throws IOException {
        FileManager.modifyFile(new File("Empleados.csv"), identificationCard, inText(employee));
    }
    
    /**
     * this method asks for the employee's data and after going through certain validations, it stores that data in a string
     * @param employee is a person
     * @param ModifyOrNewVerificationn check if it is modifyble
     * @throws IOException a file exception
     * @return a
     */
    public String inText(Employee employee) throws IOException {
        boolean flag;
        boolean aux;
        double salary=0;
        String CI;
        String phoneNumber;
        int age=0;
        String address;
        String aux1;
        FileManager file = new FileManager();
        Scanner scan = new Scanner(System.in);
        Person person= new Person();
        do
        {
            System.out.print("Ingrese su CI: ");
            CI = scan.next();
            aux1 = FileManager.searchInFile(new File("Empleados.csv"), CI);
            flag= person.checkIdentifyCardNumber(CI);
        }while(flag!=true);
        if(aux1.equals("0")){
        employee.setIdentifyCardNumber(CI);
        System.out.print("Ingrese el ID:");
        String ID = scan.next();
        employee.setId(ID);
        System.out.print("Ingrese su nombre y apellido: ");
        scan.skip("\n");
        String fullNameNormal = scan.nextLine();
        String fullName=fullNameNormal.toUpperCase();
        employee.setFullName(fullName);
        
        do{
            do{
                try{
                    System.out.print("Ingrese su edad: ");
                    age= Integer.parseInt(stdIn.readLine());
                    flag=true;
                    employee.setAge(age);
                }
                catch(NumberFormatException e){
                    System.out.println("Solo se permite el ingreso de números");
                    flag=false;
                }
            }while(flag != true); 
        }while(age<18);
        do{
            System.out.print("Ingrese el número de teléfono: ");
            phoneNumber= scan.next();
            flag = employee.checkPhoneNumber(phoneNumber);
        }while(flag!=true);
        employee.setPhoneNumber(phoneNumber);
        do{
            do{
                try{
                System.out.print("Ingrese el salario: ");
                scan.skip("\n");
                salary = Double.parseDouble(stdIn.readLine()); 
                flag=true;
                employee.setSalary(salary);
                } 
                catch(NumberFormatException e){
                    System.out.println("Solo se permite el ingreso de números");
                    flag=false;
                }
            }while(flag != true);
        }while(salary<0);    
        System.out.print("Ingrese su dirección de domicilio: ");
        scan.skip("\n");
        address = scan.nextLine();
        address = address.toUpperCase();
        employee.setAddress(address);
        return employee.getIdentifyCardNumber() + ";"
                + employee.getId() + ";" + employee.getFullName() + ";"+ employee.getAge()+ ";"
                + employee.getPhoneNumber()+ ";" + employee.getSalary()+";"+employee.getAddress()+"\r\n";
        }
        else{
            System.out.println("El empleado ya existe");
            return ("");
        }
    }
    
        /**
        * this method prints in a matrix, the employees saved in the employee's file
        */
        public void printEmployee(){
        int cont = 0;
        int num = 0;
        try {
            String chain = "";
            String acumtotal = "";
            FileReader readFile = new FileReader("Empleados.csv");
            BufferedReader buffer = new BufferedReader(readFile);
            System.out.println("\033[32m   ---------------------------------------- EMPLEADOS -------------------------------------");
            String title = "CEDULA;ID;NOMBRE;EDAD;TELEFONO;SUELDO;DOMICILIO";
            while ((chain = buffer.readLine()) != null) {
                cont++;
                String CI = chain.split(";")[0];
                String ID = chain.split(";")[1];
                String fullName = chain.split(";")[2];
                String age = chain.split(";")[3];
                String cellPhone = chain.split(";")[4];
                String salary = chain.split(";")[5];
                String address = chain.split(";")[6];
                acumtotal += CI + ";"+ ID +";" + fullName.toUpperCase() + ";" + age + ";" + cellPhone + ";"+ salary +";"+ address.toUpperCase() + ";";
                if (chain.split(";")[0].length() > num) {
                    num = chain.split(";")[0].length();
                }

            }
            int cont2 = -1;
            int espacios = 0;
            String[][] llenar = new String[cont][7];

            for (int i = 0; i < cont; i++) {
                for (int j = 0; j < 7; j++) {
                    cont2++;
                    if (acumtotal.split(";")[cont].length() <= num) {
                        espacios = 0;
                        espacios = (num) - acumtotal.split(";")[cont2].length();
                    }

                    llenar[i][j] = acumtotal.split(";")[cont2] + space(espacios);
                }
            }
            for (int i = 0; i <7; i++) {
                if (title.split(";")[i].length() <= num) {
                    
                    espacios = 0;
                    espacios = (num) - title.split(";")[i].length();
                }
                System.out.print("\033[33m" + title.split(";")[i] + space(espacios));
            }
            System.out.println("\n");
            System.out.println("    ----------------------------------------------------------------------------------------");

            for (int i = 0; i < cont; i++) {
                for (int j = 0; j < 7; j++) {
                    cont2++;
                    System.out.print(llenar[i][j]);

                }
                System.out.println("\n");
            System.out.println("    ----------------------------------------------------------------------------------------");
            }
            buffer.close();
        } catch (Exception e) {
        }

    }

    /**
     * this method prints in a matrix, the customers saved in the customer's file
     */
    public void printCustomer(){  
    int cont = 0;
    
        int num = 0;
        try {
            String chain;
            String acumtotal = "";
            FileReader readFile = new FileReader("Clientes.csv");
            BufferedReader buffer = new BufferedReader(readFile);
            System.out.println(" ................................................ CLIENTES ...................................................");
            String title = "CEDULA;NOMBRES;EDAD;CELULAR;DOMICILIO;";
            while ((chain = buffer.readLine()) != null) {
                cont++;
                String CI = chain.split(";")[0];
                String fullName = chain.split(";")[1];
                String age = chain.split(";")[2];
                String phoneNumber = chain.split(";")[3];
                String adress = chain.split(";")[4];
                acumtotal += CI + ";" + fullName.toUpperCase() + ";" + age+ ";" + phoneNumber + ";"+ adress.toUpperCase() + ";" ;
                if (chain.split(";")[1].length() > num) {
                    num = chain.split(";")[1].length();
                }

            }

            int cont2 = -1;
            int espacios = 0;
            String[][] llenar = new String[cont][5];

            for (int i = 0; i < cont; i++) {
                for (int j = 0; j < 5; j++) {
                    cont2++;
                    if (acumtotal.split(";")[cont].length() <= num) {
                        espacios = 0;
                        espacios = (num) - acumtotal.split(";")[cont2].length();
                    }

                    llenar[i][j] = acumtotal.split(";")[cont2] + space(espacios);
                }
            }
            for (int i = 0; i < 5; i++) {
                if (title.split(";")[i].length() <= num) {
                    espacios = 0;
                    espacios = (num) - title.split(";")[i].length();
                }
                System.out.print("\t" + title.split(";")[i] + space(espacios));
            }
            System.out.println("\n");
            System.out.println("    .................................................................................................................................");

            for (int i = 0; i < cont; i++) {
                for (int j = 0; j < 5; j++) {
                    cont2++;
                    System.out.print("\t"+llenar[i][j]);

                }
                System.out.println("\n");
            System.out.println("    .................................................................................................................................");
            }
            buffer.close();
        } catch (Exception e) {
        };

    }

    /**
     * Este metodo recibe como parametro un entero, mismo que ayudará a determinar el
     * numero deseados en una cadena String
     * @param esp number of spaces
     * @return es
     */
    public String space(int esp) {
        int cont = 0;
        String es = "";
        while (cont <= esp) {
            cont++;
            es += " ";
        }
        return es;
    }
    
    /**
     * this method prints in a matrix, the services saved in the service's file
     */
    public void printService()    {      
    int cont = 0;
    
        int num = 0;
        try {
            String chain;
            String acumtotal = "";
            FileReader readFile = new FileReader("Servicios.csv");
            BufferedReader buffer = new BufferedReader(readFile);
            System.out.println("\033[36m   .................. SERVICIOS ........................");
            String title = "CODIGO;NOMBRE;PRECIO;";
            while ((chain = buffer.readLine()) != null) {
                cont++;
                String codigo = chain.split(";")[0];
                String fullName = chain.split(";")[1];
                String precio = chain.split(";")[2];
                acumtotal += codigo + ";" + fullName.toUpperCase() + ";" + precio+ ";" ;
                if (chain.split(";")[0].length() > num) {
                    num = chain.split(";")[0].length();
                }

            }

            int cont2 = -1;
            int espacios = 0;
            String[][] llenar = new String[cont][3];

            for (int i = 0; i < cont; i++) {
                for (int j = 0; j < 3; j++) {
                    cont2++;
                    if (acumtotal.split(";")[cont].length() <= num) {
                        espacios = 0;
                        espacios = (num) - acumtotal.split(";")[cont2].length();
                    }

                    llenar[i][j] = acumtotal.split(";")[cont2] + space(espacios);
                }
            }
            for (int i = 0; i < 3; i++) {
                if (title.split(";")[i].length() <= num) {
                    espacios = 0;
                    espacios = (num) - title.split(";")[i].length();
                }
                System.out.print("\033[35m\t" + title.split(";")[i] + space(espacios));
            }
            System.out.println("\n");
            System.out.println("    ......................................................");

            for (int i = 0; i < cont; i++) {
                for (int j = 0; j < 3; j++) {
                    cont2++;
                    System.out.print("\t"+llenar[i][j]);

                }
                System.out.println("\n");
            System.out.println("    ......................................................");
            }
            buffer.close();
        } catch (Exception e) {
        };

    }
    
    /**
     * This method receives the ID from a customer to verify if it already 
     * exists in the customer's file, if it exists, the method returns that employee's data stores in a string
     * @param IDCode of a person  
     * @return aux 
     */
    public String searchCustomer(String IDCode)
    {
        String aux;
        aux = file.searchInFile(new File("Clientes.csv"),IDCode);
        if(aux == "0")
        {
            System.out.println("El cliente no existe, por favor registrelo");
            return "0";
        }
        else
        {
            List <String> dataOutput = Arrays.asList(aux.split(";"));
            if(dataOutput.get(0).equals(IDCode))
            {
                return aux;
            }
            else
            {
                System.out.println("El cliente no existe, por favor registrelo");
                return "0";
            }
        }
    }
    
    public void deleteEmployee(String file, ArrayList<Employee>employees, String ic) throws IOException {
		String letter = "";
                FileManager.readEmployee(file);
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			for (int k = 0; k < employees.size(); k++) {
				if (employees.get(k).getIdentifyCardNumber().equals(ic)) {
                                    System.out.println("Se encontro el empleado");
                                    System.out.println("El empleado con cedula de identidad " + employees.get(k).getIdentifyCardNumber() + 
                                                         employees.get(k).getFullName() + " ha sido eliminado del registro");
				} else {
                                letter = employees.get(k).getIdentifyCardNumber() + ";" + employees.get(k).getFullName() + ";"
                                       + employees.get(k).getSalary() + ";" + employees.get(k).getPhoneNumber() + ";" 
                                        + employees.get(k).getAddress();
                                        bw.write(letter);
                                bw.newLine();
                                }
			}

			bw.close();
			employees.clear();

		} catch (Exception e) {
		}
}
    
}