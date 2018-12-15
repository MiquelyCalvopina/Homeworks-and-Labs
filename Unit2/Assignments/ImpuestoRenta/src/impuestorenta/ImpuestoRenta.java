package impuestorenta;

import ec.edu.espe.renta.operation.Operation;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Pocho
 */
public class ImpuestoRenta {

    public static void main(String[] args) {
        Operation operation = new Operation();
        Scanner sca = new Scanner(System.in);
        float salary=1;
        String name;
        System.out.println("NAME: ");
        name=sca.nextLine();
            System.out.println("SALARY: ");
            salary = sca.nextFloat();
            System.out.print("SR. "+name+" THE AMOUNT OF TAX IS : $ "); operation.impRenta(salary);
    }

}
