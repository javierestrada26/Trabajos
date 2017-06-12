
package arreglos;

import java.util.Scanner;
public class Arreglos {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int[] lista;
        int n,i;
        System.out.println("Ingrese el límite de la lista ");
        n = entrada.nextInt();
                        
        lista = new int [n];
        for( i=0; i<lista.length; i++){
            System.out.println("Ingrese el valor de la  lista []" +i);
            lista[i]= entrada.nextInt();
            
        }
        for( i=lista.length;i>=0;i--){
            if(lista[1]%2==0){
            System.out.println("lista " +lista[i] + "Es par");
            }
            else{
              System.out.println("lista " +lista[i] + "Es impar");   
            }
    }
        
    }
    
}
