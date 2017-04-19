
package ejercicio4;

import java.util.Scanner;
public class EJERCICIO4 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        char dia;
        //Pedir variable
        System.out.println("Ingrese un día de la semana");
        dia = entrada.next().charAt(0);
        switch(dia){
            case 'L':
                System.out.println("Desarrollo Espiritual");
                break;
            case 'M':
                System.out.println("Lógica Matemática");
                break;
            case 'W':
                System.out.println("Programación");
                break;
            case 'J':
                System.out.println("Física");
                break;
            case 'V':
                System.out.println("Farra");
                break;
            default :
                System.out.println("Día invalido");
                break;
        }
        System.out.println("La clase para el día seleccionado es " + dia);
    }
    
}
