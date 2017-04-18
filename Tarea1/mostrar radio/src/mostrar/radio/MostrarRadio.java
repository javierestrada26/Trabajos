
package mostrar.radio;

import java.util.Scanner;
public class MostrarRadio {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //Declarar variables
        double radio;
        double volumen;
        double area;
        //Iniciar variables 
        radio = 0;
        //Pedir variables
        System.out.println(" Ingrese el radio de la esfera ");
        radio = entrada.nextDouble();
        //Operaciones
        volumen = (4*3.1416*(radio*radio*radio))/3;
        area = 3.1416*radio*radio;
        //Resultados
        System.out.println("El volúmen de la esfera es de " + volumen + "y el área de la esfera es de " + area );
                
    }
    
}
