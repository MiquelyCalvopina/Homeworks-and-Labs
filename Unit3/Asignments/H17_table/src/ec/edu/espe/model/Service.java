
package ec.edu.espe.model;


import java.util.Random;
import java.util.Scanner;

/**
 * @author Bryan Zurita 
 * @author Sebastian Zuñiga
 */
public class Service {
    private String fullName;
    private String code;
    private double cost;
    

    /**
     * Constructor
     * @param code
     * @param fullName
     * @param cost 
     */
    public Service(String code, String fullName,  double cost) {
        this.fullName = fullName;
        this.code = code;
        this.cost = cost;
    }

    /**
     * Getter
     * @return fullName 
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Setter
     * @param name 
     */
    public void setFullName(String name) {
        this.fullName = name;
    }

    /**
     * Getter
     * @return cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * Setter
     * @param cost 
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * Getter
     * @return code 
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter
     * @param code 
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * Generates the code of the service, concatenating "S" with a random number
     * @return code 
     */
    public String generateCode(){
        Random generadorAleatorios = new Random();
        int numeroAleatorio = 1+generadorAleatorios.nextInt(287);
        String code= "S"+numeroAleatorio;
        return code;
    }  
    
    /**
     * Store the data of a service in a String
     * @param service
     * @return 
     */
    public String toString(Service service){
        String string=service.getFullName()+","+service.getCode()+"\r\n"+" ";
        return string;
    }
}