
package ejercicio.pkg19;

import java.util.Scanner;
public class Ejercicio19 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //Declarar variables
        double angulo;
        double seno;
        double coseno;
        double radianes;
        //Pedir variables
        System.out.println(" Ingrese tamaño del ángulo en grados ");
        angulo = entrada.nextDouble();
        //Operaciones
        radianes = (angulo*3.1416/180);
        seno = Math.cos(angulo);
        coseno = Math.sin(angulo);
        //Resultados 
        System.out.println(" El seno es " + seno);
        System.out.println(" El coseno es " + coseno);
    }
    
}
