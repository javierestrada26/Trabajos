
package arreglo.pkg2.pkg3;

import java.util.Scanner;
public class Arreglo23 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int[] lista;
        int n,i,rep=0;
        System.out.println("Ingrese el límite de la lista ");
        n = entrada.nextInt();
                        
        lista = new int [n];
        for( i=0; i<lista.length; i++){
            System.out.println("Ingrese el valor de la  lista []" +i);
            lista[i]= entrada.nextInt();
            
        }
        for(int d = 0; d < lista.length; d++){
            for(i = 0; i < lista.length; i++) {
                if(lista[i] == d) {
                    rep++;
                }
            }
            if(rep > 0) {
                System.out.println(
                    String.format("El número %d se repite %d %s", 
                                  d, rep, (rep == 1 ? "vez" : "veces"))
                );
            }
        }
    }
    
}
