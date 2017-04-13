
package ejercicio1;

import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //Declarar variables 
        double costo;
        double pre_metrocuadra;
        double ancho;
        double largo;
        double multiplicacion1,multiplicacion2;
        //Iniciar variables
        pre_metrocuadra = 0;
        ancho = 0;
        largo = 0; 
        multiplicacion1 = 0;
        //Pedir variables
        System.out.println("Ingrese costo por metro cuadrado");
        pre_metrocuadra = entrada.nextDouble();
        System.out.println("Ingrese ancho del terreno ");
        ancho = entrada.nextDouble();
        System.out.println("Ingrese largo del terreno");
        largo = entrada.nextDouble();
        //Operaciones
        multiplicacion1 = ancho * largo;
        multiplicacion2 = multiplicacion1 * pre_metrocuadra;
        //Resultados
        System.out.println("El precio de su terreno es igual a " +multiplicacion2+ " dolares ");
    }
    
}
