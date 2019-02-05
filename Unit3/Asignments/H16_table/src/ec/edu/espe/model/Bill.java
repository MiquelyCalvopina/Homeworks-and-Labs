
package ec.edu.espe.model;

import ec.edu.espe.utils.Operations;
import ec.edu.espe.utils.Scan;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Bryan Zurita
 * @author Sebas Zuiga
 */

    
public class Bill {
    private String billCode;
    private final double iva=0.12;
    BarberShop barbershop=new BarberShop();
private static BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
    /**
     * Getter
     * @return billCode 
     */
    public String getBillCode() {
        return billCode;
    }

    /**
     * Setter
     * @param billCode 
     */
    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }
    
    /**
     * Getter
     * @return iva
     */
    public double getIva() {
        return iva;
    }

    /**
     * This method creates an array of products and one of services
     * @param product
     * @param service
     * @return total
     */
    public double addProductOrService (Product product, Service service){
        double total=0;
        ArrayList <Product> listProducts = new ArrayList <>();
        listProducts.add(new Product("","",0,0.0F));
        ArrayList <Service> listServices = new ArrayList <>();
        listServices.add(new Service("","",0));
        return total;
    }
    
    /**
     * this method generates the id of the invoices, concatenated the word "FACT" and a random number
     * @return 
     */
    public String generatecode(){
        Random generadorAleatorios = new Random();
        int numeroAleatorio = 1+generadorAleatorios.nextInt(399);
        String code= "FACT"+numeroAleatorio; 
    return code;
    }

 
    /**
      * this method prints the bill of the services and products purchased by the customer
      * @param employee
      * @param customer
      * @param service
      * @throws IOException 
      */
     public void makeBill(Employee employee, Customer customer, Service service) throws IOException{
        Scanner scan = new Scanner(System.in);
        Operations operation=new Operations();
        String stringAux;
        String opcion="S";
        String servicio;
        String producto;
        double acum = 0;
        double precioProducto = 0;
        double pago = 0;
        double vuelto = 0 ;
        double precioServicio = 0;
        int quantityProduct = 0;
        Date fecha = new Date();
        System.out.println("");
        try{
        System.out.println("Ingrese la cedula del cliente");
        stringAux = scan.next();
        String stringAux1=barbershop.searchCustomer(stringAux);
        employee.attend(customer, employee);
        boolean bandera=false;
        int quantityService = 0;
            do
            {
                try
                {
                     System.out.println("Cuantos servicios obtuvo?");
                      quantityService = Integer.parseInt(stdIn.readLine()); 
                      bandera=true;
                                } 
                                catch(NumberFormatException e)
                                {
                                    System.out.println("Solo se permite el ingreso de números");
                                    bandera=false;
                                }
                         }while(bandera != true);
        String[] nombreServicio= new String[quantityService];
        Double[] costoServicio= new Double[quantityService];
       do
            {
                try
                {
                     System.out.println("Cuantos productos obtuvo?");
                      quantityProduct = Integer.parseInt(stdIn.readLine()); 
                      bandera=true;
                                } 
                                catch(NumberFormatException e)
                                {
                                    System.out.println("Solo se permite el ingreso de números");
                                    bandera=false;
                                }
                         }while(bandera != true);
        String[] nombreProducto= new String[quantityProduct];
        Double[] costoProducto= new Double[quantityProduct];
        if (quantityService >= 1){
        for (int i=0;i<quantityService;i++){
        System.out.println("Que servicio obtuvo?");
        scan.skip("\n");
        servicio=scan.nextLine();
        nombreServicio[i]=servicio;
        do
            {
                try
                {
                     System.out.println("Cual es el precio del producto obtenido?");
                      precioServicio = Double.parseDouble(stdIn.readLine()); 
                      bandera=true;
                                } 
                                catch(NumberFormatException e)
                                {
                                    System.out.println("Solo se permite el ingreso de números");
                                    bandera=false;
                                }
                         }while(bandera != true);
        costoServicio[i]=precioServicio;
        acum=acum+precioServicio;
        }
        employee.attend(customer, employee);
        for (int i=0;i<quantityProduct;i++){
        System.out.println("Que producto obtuvo?");
        producto=scan.nextLine();
        nombreProducto[i]=producto;
        bandera=false;
        do
            {
                try
                {
                     System.out.println("Cual es el precio del producto obtenido?");
                      precioProducto = Double.parseDouble(stdIn.readLine()); 
                      bandera=true;
                                } 
                                catch(NumberFormatException e)
                                {
                                    System.out.println("Solo se permite el ingreso de números");
                                    bandera=false;
                                }
                         }while(bandera != true);
        costoProducto[i]=precioProducto;
        acum=acum+precioProducto;}
        }
        do{
        pago=customer.pay(this);
        }while(pago <= acum);
        vuelto=operation.sub(pago, acum);
        System.out.println("Barber Shop");
        System.out.println (fecha);
        System.out.println("Cuenta");
        System.out.println(stringAux1);
        System.out.println("Servicios y Productos");
        System.out.println("                              \tTotal     ");
        for(int i=0;(i<=quantityService)&&(i<=quantityProduct);i++){
        System.out.println(""+nombreServicio[i]+"                          \t$"+costoServicio[i]);
        System.out.println(""+nombreProducto[i]+"                          \t$"+costoProducto[i]);
        }
        }
        catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Precio total                \t$"+acum);
        System.out.println("Pago                        \t$"+pago);
        System.out.println("Vuelto                      \t$"+vuelto);
        }
    }
    }
