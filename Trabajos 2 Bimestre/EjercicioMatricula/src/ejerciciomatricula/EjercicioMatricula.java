
package ejerciciomatricula;
import java.util.Scanner;
/**
 *
 * @author Javier
 */
public class EjercicioMatricula {
public static Scanner entrada = new Scanner (System.in);
    
    public static void main(String[] args) {
       int ciclo,valor_credito;
       double total_pagar,desc_beca;
       total_pagar = descuento( (ciclo() +valor_credi() ));
       System.out.println("El valor total a pagar es de: " +total_pagar);
    }
    public static double ciclo (){
        System.out.println("Ingrese el ciclo académico al que desea matricularse ");
        int ciclo = entrada.nextInt();
        int opcion = 700 + ((ciclo-1) * 10);
        return opcion;
    }
    public static double valor_credi (){
        System.out.println(" Ingrese el número de materias troncales ha tomar ");
        int troncales = entrada.nextInt();
        System.out.println(" Ingrese el número de materias de libre configuración a tomar");
        int libre_confi = entrada.nextInt();
        double subtotal1,subtotal2, total_credi;
        subtotal1 = (troncales * 4 * 35);
        subtotal2 = (libre_confi * 3 * 35);
        total_credi= subtotal1 + subtotal2;
        return total_credi;
    }
    public static double descuento (int resultado){
        Scanner entrada = new Scanner (System.in);
        double total , descuento;
        System.out.println(" Seleccione un tipo de Beca : ");
        System.out.println(" Méritos Academicos---->1");
        System.out.println(" Beca Familiar---->2");
        System.out.println(" No cuenta cin ninguna beca---->3");
        int beca = entrada.nextInt();
        switch (beca){
            case 1 :
                descuento = 0.15;
                break;
            case 2:
                descuento = 0.08;
                break;
            default:
                descuento = 0;
                break;       
        }
        total = (resultado-(resultado*descuento)) * 1.14;
        return total;
    }
}
