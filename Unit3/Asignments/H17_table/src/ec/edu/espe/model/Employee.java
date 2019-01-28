
package ec.edu.espe.model;

import ec.edu.espe.utils.FileManager;
import static ec.edu.espe.utils.FileManager.writeFile;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;

/**
 * @author Bryan Zurita
 * @author Sebastian Zuñiga
 */
public class Employee extends Person{
    private String id;
    private double salary;
    
    
    BarberShop barbershop=new BarberShop();
    FileManager file=new FileManager();
    Inventory inventory=new Inventory();
    
    /**
     * Getter
     * @return id
     */
    public String getId() {
        return id;
    }
    
    /**
     * Setter
     * @param id 
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter
     * @return salary 
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Setter
     * @param salary 
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String identifyCard, String id, String fullName, int age, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public Employee() {
    }
    
    /**
     * This method prints available services and inventory
     * @param customer
     * @param employee
     * @throws IOException 
     */
    public void attend(Customer customer, Employee employee) throws IOException{
       barbershop.printService();
       inventory.printInventory();
    }
    
    /**
     * this method registers the attendance of employees with year, month, day, hour, second and minute
     * and saves it in a file
     * @param employee 
     */
    public void assist(Employee employee) throws FileNotFoundException, IOException{
        String tempOption;
        String textFile = " ";
        String textAssist = " ";
        char option = 0;
        int validationChar;
        Calendar now = Calendar.getInstance();
        int dayCalendar = now.get(Calendar.DATE);
        int monthCalendar = now.get(Calendar.MONTH)+1;
        int yearCalendar = now.get(Calendar.YEAR);
        int hourCalendar = now.get(Calendar.HOUR_OF_DAY);
        int minuteCalendar = now.get(Calendar.MINUTE);
        int secondCalendar = now.get(Calendar.SECOND);
        String identifyCard;
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.print("Ingrese su CI: ");
        identifyCard=scan.next();
        String chain = "";
            String acumtotal = "";
            FileReader readFile = new FileReader("Empleados.csv");
            BufferedReader buffer = new BufferedReader(readFile);
            while ((chain = buffer.readLine()) != null) {
                String CI = chain.split(";")[0];
                String ID = chain.split(";")[1];
                String fullName = chain.split(";")[2];
                String age = chain.split(";")[3];
                String cellPhone = chain.split(";")[4];
                String salary = chain.split(";")[5];
                String address = chain.split(";")[6];
                acumtotal += CI + ";"+ ID +";" + fullName.toUpperCase() + ";" + age + ";" + cellPhone + ";"+ salary +";"+ address.toUpperCase() + ";";
                
                if(chain.contains(identifyCard))
                    {
                        employee.setId(ID);
                        employee.setFullName(fullName);
                        employee.setAge(Integer.parseInt(age));
                        employee.setIdentifyCardNumber(CI);
                        employee.setPhoneNumber(cellPhone);
                    }
            }
        
        System.out.println("ID: "+employee.getId());
        System.out.println("Nombre: "+employee.getFullName());
        System.out.println("Edad: "+employee.getAge());
        System.out.println("CI: "+employee.getIdentifyCardNumber());
        System.out.println("Telf: "+employee.getPhoneNumber()+"\n");
        System.out.println("El Empleado antes mencionado asistio el dia de hoy?\nIngrese una \"s\" si esque asistio o \"n\" si esque no");
        
        do{
            Scanner in = new Scanner(System.in);
            tempOption = in.next();
            validationChar = tempOption.length();
            
            if(validationChar == 1){
                option = tempOption.charAt(0);
                switch (option) {
                    case 'S':
                    case 's':
                        System.out.println("");
                        System.out.println("Si asistio...");
                        System.out.println("Dia: "+dayCalendar);
                        System.out.println("Mes: "+monthCalendar);
                        System.out.println("Año: "+yearCalendar);
                        System.out.println("Hora: "+hourCalendar);
                        System.out.println("Minuto: "+minuteCalendar);
                        System.out.println("Segundo: "+secondCalendar+"\n");
                        textAssist=";"+dayCalendar+";"+monthCalendar+";"+yearCalendar+";"+";"+hourCalendar+";"+minuteCalendar+";"+secondCalendar+"\n";
                        break;
                    case 'N':
                    case 'n':
                        System.out.println("");
                        System.out.println("no asistio...en la siguiente fecha");
                        System.out.println("Dia: "+dayCalendar);
                        System.out.println("Mes: "+monthCalendar);
                        System.out.println("Año: "+yearCalendar+"\n");
                        break;
                    default:
                        System.out.println("Ingrese \"s\" o \"n\" verifique su ingreso y vuelva a intentarlo...");
                        break;
                }
            }else{
                System.out.println("Solo ingrese un caracter \"s\" o \"n\" por favor...");
            }
        }while(option != 'S' && option != 's' && option != 'N' && option != 'n');
        
        textFile=employee.getId()+";"+employee.getFullName()+";"+employee.getAge()+";"+employee.getIdentifyCardNumber()+";"+employee.getPhoneNumber()+";"+textAssist;
        try 
        {
            FileWriter writeAssist=new FileWriter("Asistencia Empleados.csv",true);
            BufferedWriter bufferWriter = new BufferedWriter(writeAssist);
            writeAssist.write(textFile);
            bufferWriter.newLine();
            writeAssist.close();
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String toString(Employee person)
    {
        String auxStringInput = person.getIdentifyCardNumber() + ";" + person.getId() + ";" 
                         + person.getFullName() + ";"+ person.getAge()+ ";"
                         + person.getPhoneNumber()+ ";" + person.getSalary()+";"
                         + person.getAddress()+"\r\n";
        return auxStringInput;
    }
    
    public boolean SalaryVerification(JTextField txt, Employee employee) {
        
        String auxStringInput = txt.getText();
        double auxStringInputInt= Double.parseDouble(auxStringInput);
        boolean salaryVerification = (auxStringInputInt > 0 );
        boolean salaryVerificationSave = false;
        
        if (salaryVerification == true) {
            employee.setSalary(auxStringInputInt);
            txt.setBackground(Color.WHITE);
            salaryVerification = true;
            return salaryVerification;
        } else {
            txt.setBackground(Color.red);
            salaryVerificationSave = false;
            
            return salaryVerificationSave;
        }
    }
    
    public void modifyEmployeeId(String code , String attribute , ArrayList<Employee>employees,File file) throws IOException{
        FileManager.readEmployee("Empleados.csv");
        
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getIdentifyCardNumber().equals(code)){
                    employees.get(i).setId(attribute);
            }
        FileManager.saveArrayInFile(file, employees);
        employees.clear();
        }
    }
    
    public void modifyEmployeeSalary(String code , String attribute , ArrayList<Employee>employees,File file) throws IOException{
        FileManager.readEmployee("Empleados.csv");
        double newSalary = Double.parseDouble(attribute);
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getIdentifyCardNumber().equals(code)){
                    employees.get(i).setSalary(newSalary);
            }
        FileManager.saveArrayInFile(file, employees);
        employees.clear();
        }
    }
    
}