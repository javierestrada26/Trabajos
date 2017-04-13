
package ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //Declarar variables
        int cant_horas,cant_segundos,cant_minutos,cant_dias;
        //Pedir variables
        System.out.println("Ingrese el número de horas");
        cant_horas = entrada.nextInt();
        //Operaciones
        cant_segundos = cant_horas * 3600;
        cant_minutos = cant_horas * 60;
        cant_dias = cant_horas / 24;
        //Resultados
        System.out.println("El resultado en segundos es " +cant_segundos+ " segundos ");
        System.out.println("El resultado en minutos es " +cant_minutos+ " minutos ");
        System.out.println("El resultado en días es " +cant_dias+" días ");
    }
    
}
