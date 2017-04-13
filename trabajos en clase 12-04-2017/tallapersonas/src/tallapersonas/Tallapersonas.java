
package tallapersonas;
import java.util.Scanner;
public class Tallapersonas {

    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
         //Declarar variables
         double persona1,persona2,persona3,persona4,persona5;
         double suma_talla,div_talla,total;
         //Iniciar Variables
         persona1 = 0;
         persona2 = 0;
         persona3 = 0;
         persona4 = 0;
         persona5 = 0;
         //Pedir variables
         System.out.println("Ingrese talla de la persona 1");
         persona1 = entrada.nextDouble();
         System.out.println("Ingrese talla de la persona 2");
         persona2 = entrada.nextDouble();
         System.out.println("Ingrese talla de la persona 3");
         persona3 = entrada.nextDouble();
         System.out.println("Ingrese talla de la persona 4");
         persona4 = entrada.nextDouble();
         System.out.println("Ingrese talla de la persona 5");
         persona5 = entrada.nextDouble();
         //OPERACIONES
         suma_talla = persona1 + persona2 + persona3 + persona4 + persona5;
         div_talla = suma_talla / 5;
         total = div_talla;
         System.out.println("La media de talla de todas las personas es " +total+ "metros");
    }
    
}
