
package ejerciciotemperatura2;

import java.util.Scanner;
public class Ejerciciotemperatura2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //Declarar variables
        int grados_total;
        int grados_fahrenheit;
        //Iniciar variables
        grados_total = 0;
        //Pedir Variables
        System.out.println("Ingrese temperatura en Grados Celsius");
        grados_total = entrada.nextInt();
        //Operaciones
        grados_fahrenheit = ((9/5*grados_total)+32);
        //Mostrar resultados
        System.out.println("La temperatura en Fahrenheit es " +grados_fahrenheit);
        
        
    }
    
}
