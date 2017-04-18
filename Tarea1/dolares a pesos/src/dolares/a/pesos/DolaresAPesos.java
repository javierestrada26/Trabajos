
package dolares.a.pesos;

import java.util.Scanner;
public class DolaresAPesos {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //Declarar variables
        double dolares;
        int pesos;
        double resultado;
        //Iniciar variables
        dolares = 0;
        pesos = 20;
        resultado = 0;
        
        //Pedir variables
        System.out.println("Ingrese numero de dolares a comprar");
        dolares = entrada.nextDouble();
        //Operaciones
        resultado = pesos * dolares;
        //Mostrar resultados
        System.out.println("La cantidad a pagar por " + dolares + " dolares en pesos mexicanos es de " + resultado + " pesos ");
    }
    
}
