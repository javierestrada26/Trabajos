
package ejercicio.de.kilometrosluz;

import java.util.Scanner;
public class EjercicioDeKilometrosluz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //Declarar variables
        int cant_horas;
        int kilometros;
        int segundos;
        int resultado;
        //Inicar variables
        cant_horas = 0;
        kilometros = 300000;
        segundos = 0;
        resultado = 0;
        //Pedir variables
        System.out.println("Ingrese numero de horas ");
        cant_horas = entrada.nextInt();
        //Operaciones
        segundos = cant_horas * 3600;
        resultado = segundos * kilometros;
        System.out.println("La distancia que recorre la luz en " + cant_horas + " es igual a " +resultado);
        
        
    }
    
}
