
package conversion.de.moneda;

import java.util.Scanner;
public class ConversionDeMoneda {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //Declarar variables
        double dolares;
        double pesos;
        double yen;
        double pesetas;
        double libra_esterlina;
        double marcos;
        double resultado;
        //Iniciar Variables
        
        pesos = 20;
        yen = 108.406;
        pesetas = 155.76;
        libra_esterlina = 0.77832;
        marcos = 1.83;
        resultado = 0;
        //Pedir variables 
        System.out.println(" Ingrese número de dolares a comprar ");
        dolares = entrada.nextDouble();
        //Operaciones 
        pesos = pesos * dolares;
        yen = yen * dolares;
        pesetas = pesetas * dolares;
        libra_esterlina = libra_esterlina * dolares;
        marcos = marcos * dolares ;
        //Resultado
        System.out.println(" La cantidad a pagar por " + dolares + " dolares, es la siguiente: ");
        System.out.println(" Pesos mesxicanos : " + pesos);
        System.out.println(" En Yenes : " + yen);
        System.out.println(" En Pesetas : " + pesetas);
        System.out.println(" En Libras Esterlinas : " + libra_esterlina);
        System.out.println(" En Marcos : " +marcos);
        
    }
    
}
