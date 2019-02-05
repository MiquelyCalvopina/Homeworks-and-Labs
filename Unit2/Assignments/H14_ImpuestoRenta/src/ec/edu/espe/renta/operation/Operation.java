package ec.edu.espe.renta.operation;

/**
 * 
 * @author Miquely Calvopiña
 * @version 0.9
 * @since 0.1
 * 
 */
public class Operation {

    float imBasica;
    float impExcedente;
    float newSalary;
    float impuestos=1;
    float result;
    
    /**
     * This method compute the Impuesto a la Renta
     * The salary is on dolars anually
     * Impuesto a la Renta 2018
     * @param salary
     * @return impuestos 
     */
    public float impRenta(float salary) {
        newSalary = salary * 12;

        if (newSalary > 0 && newSalary <= 11270) {
            imBasica = 0;
            impExcedente = 0;
            impuestos = impExcedente + imBasica;
            System.out.println(impuestos);
        } else if (newSalary > 11270 && newSalary <= 14360) {
            imBasica = 0;
            impExcedente = newSalary - 11270;
            impExcedente = (impExcedente * 5) / 100;
            impuestos = impExcedente + imBasica;
            System.out.println(impuestos);
        } else if (newSalary > 14360 && newSalary <= 17950) {
            imBasica = 155;
            impExcedente = newSalary - 14360;
            impExcedente = (impExcedente * 10) / 100;
            impuestos = impExcedente + imBasica;
            System.out.println(impuestos);
        } else if (newSalary > 17950 && newSalary <= 21550) {
            imBasica = 514;
            impExcedente = newSalary - 17950;
            impExcedente = (impExcedente * 12) / 100;
            impuestos = impExcedente + imBasica;
            System.out.println(impuestos);
        } else if (newSalary > 21550 && newSalary <= 43100) {
            imBasica = 946;
            impExcedente = newSalary - 21550;
            impExcedente = (impExcedente * 15) / 100;
            impuestos = impExcedente + imBasica;
            System.out.println(impuestos);
        } else if (newSalary > 43100 && newSalary <= 64630) {
            imBasica = 4178;
            impExcedente = newSalary - 43100;
            impExcedente = (impExcedente * 20) / 100;
            impuestos = impExcedente + imBasica;
            System.out.println(impuestos);
        } else if (newSalary > 64630 && newSalary <= 86180) {
            imBasica = 8484;
            impExcedente = newSalary - 64630;
            impExcedente = (impExcedente * 25) / 100;
            impuestos = impExcedente + imBasica;
            System.out.println(impuestos);
        } else if (newSalary > 86180 && newSalary <= 114890) {
            imBasica = 13872;
            impExcedente = newSalary - 86180;
            impExcedente = (impExcedente * 30) / 100;
            impuestos = impExcedente + imBasica;
            System.out.println(impuestos);
        } else if (newSalary > 114890) {
            imBasica = 22485;
            impExcedente = newSalary - 114980;
            impExcedente = (impExcedente * 35) / 100;
            impuestos = impExcedente + imBasica;
            System.out.println(impuestos);
            return impuestos;
        } else {
            System.out.println("PLEASE ENTER POSTIIVE NUMBERS \n");
        }
        return impuestos;
    }

}
