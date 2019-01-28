
package ec.edu.espe.model;


import ec.edu.espe.utils.FileManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bryan Zurita
 */
    public class Customer extends Person{

    /**
     * Getter
     * @param address
     * @return adress
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public Customer(String identifyCardNumber, String fullName, int age, String phoneNumber, String address) {
        this.identifyCardNumber = identifyCardNumber;
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

 
    private String identifyCardNumber;
    private String fullName;
    private int age;
    private String phoneNumber;
    private String address;


    public Customer() {
    }
    
    
    /**
     * This method valid that the payment entry, be in numbers
     * @param bill
     * @return pago
     */
    public double pay(Bill bill){
        Scanner scan = new Scanner(System.in);
        boolean bandera=false;
        double pago = 0;
        do {            
            try {
                System.out.println("Ingrese el pago del cliente");
                pago=scan.nextDouble();
                bandera = true;
            } catch (Exception e) {
                System.out.println("Solo se permite el ingreso de números");
                bandera=false;
            }
        } while (bandera==false);
        return pago;
    }
    
    public void modifyAge(String CI , String attribute , ArrayList<Customer> customers,File file) {
           FileManager.createCustomerArray(customers, file);
        int newCost;
        newCost = Integer.parseInt(attribute);
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getIdentifyCardNumber().equals(CI))   customers.get(i).setAge(newCost);
        }
        FileManager.saveArrayInFileCustomer(file, customers);
    }


	public void modifyPhoneNumber(String CI , String attribute , ArrayList<Customer> customers,File file) {
        FileManager.createCustomerArray(customers, file);
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getIdentifyCardNumber().equals(CI))   customers.get(i).setPhoneNumber(attribute);
        }
        FileManager.saveArrayInFileCustomer(file, customers);
    }
        public void modifyAddress(String CI , String attribute , ArrayList<Customer> customers,File file) {
        FileManager.createCustomerArray(customers, file);
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getIdentifyCardNumber().equals(CI))   customers.get(i).setAddress(attribute);
        }
        FileManager.saveArrayInFileCustomer(file, customers);
    }
      public void modifyCI(String CI , String attribute , ArrayList<Customer> customers,File file){
        FileManager.createCustomerArray(customers, file);
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getIdentifyCardNumber().equals(CI))   customers.get(i).setIdentifyCardNumber(attribute);
        }
        FileManager.saveArrayInFileCustomer(file, customers);
    }

        
	public void modifyName(String CI , String attribute , ArrayList<Customer> customers,File file){
		
                FileManager.createCustomerArray(customers, file);
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getIdentifyCardNumber().equals(CI))   customers.get(i).setFullName(attribute);
        }
        FileManager.saveArrayInFileCustomer(file, customers);
    }
       
    
    
    
    
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdentifyCardNumber() {
        return identifyCardNumber;
    }

    public void setIdentifyCardNumber(String identifyCardNumber) {
        this.identifyCardNumber = identifyCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }
    
   
}
