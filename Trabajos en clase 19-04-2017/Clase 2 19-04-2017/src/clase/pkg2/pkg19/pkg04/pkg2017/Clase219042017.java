
package clase.pkg2.pkg19.pkg04.pkg2017;

import java.util.Scanner;
public class Clase219042017 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //Declarar variables 
        int edad,anio_actual,anio_naci;
        String ciudad;
        String ciudad_votante;
        //iniciar
         anio_actual = 2017;
         anio_naci =0;
         ciudad_votante = "loja";
        //Pedir variables
        System.out.println(" Ingrese su año de nacimiento por favor ");
        anio_naci= entrada.nextInt();
        System.out.println("Ingrese ciudad de residencia");
        ciudad = entrada.next();
        //calculos
        edad = anio_actual - anio_naci;
        //Calculos condicionales
        if(edad<16){
            System.out.println(" Usted no puede votar");
        }
        else {
            if(edad<18){
                System.out.println("Usted puede sufragar opcionalmente");
            }
            else{
                if(edad <= 65){
                    System.out.println("Usted debe votar obligatoriamente");
                }
                else{
                    System.out.println("Usted puede sufragar opcionalmente");
                }
            }
        }
        if (ciudad==ciudad_votante){
            System.out.println(" Usted deber votar en este ciudad");
        }
        else{
            System.out.println("Dirigase a su ciudad de origen");
        }
    }
    
}
