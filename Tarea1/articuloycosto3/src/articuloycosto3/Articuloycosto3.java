
package articuloycosto3;

import java.util.Scanner;

public class Articuloycosto3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //Declarar Variables
        double utilidad;
        double impuesto;
        double costo,precio_venta;
        String articulo;
        //Iniciar variables 
        utilidad = 1.50;
        impuesto = 0.15;
        articulo = "" ;
        // Pedir variables
        System.out.println(" Ingrese el nombre del artículo ");
        articulo = entrada.next();
        System.out.println(" Ingrese el precio del articulo");
        costo= entrada.nextDouble();
        //Operaciones
        precio_venta = (((costo*utilidad)+costo)*impuesto)+costo;
        //Resultados
        System.out.println(" El artículo " + articulo + " tiene una utilidad de " + utilidad + " con un impuesto de " + impuesto + " y con un precio de venta de " + precio_venta + "dolares");
    }
    
}
