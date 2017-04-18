
package ejercico.pkg17;
import java.util.Scanner;

public class Ejercico17 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //Declarar variables
        double tangente,cotangente,secante,cosecante,angulo;
        //Pedir variable
        System.out.println("Ingrese el tamaño de ángulos en radianes");
        angulo = entrada.nextDouble();
        //Transformar
        angulo = Math.toRadians(angulo);
        //Operaciones
        tangente = Math.sin(angulo)/Math.cos(angulo);
        cotangente = Math.cos(angulo)/Math.sin(angulo);
        secante = 1/Math.cos(angulo);
        cosecante=1/Math.sin(angulo);
        //Resultados
        System.out.println("La transformación a tangente es " +tangente);
        System.out.println("La transformación a cotangente es " +cotangente);
        System.out.println("La transformación a secante es " +secante);
        System.out.println("La transformación a cosecante es " +cosecante);
    }
    
}
