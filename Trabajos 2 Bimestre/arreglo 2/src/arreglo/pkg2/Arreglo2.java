
package arreglo.pkg2;

import java.util.Scanner;
public class Arreglo2 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int[] lista;
        int n,i,suma1=0,suma2=0,c=0,j=0;
        System.out.println("Ingrese el límite de la lista ");
        n = entrada.nextInt();
                   
        lista = new int [n];
        for( i=0; i<lista.length; i++){
            System.out.println("Ingrese el valor de la  lista []" +i);
            lista[i]= entrada.nextInt();
        }
        while (c<=i){
            if(i%2==0){
                suma1=suma1+c;
                c=c+2;
                System.out.println("La suma de la fila 1 es " +suma1);
                break;
            }
            while(c<=i){
                if(i%2!=0){
                suma2=suma2+j;
                j++;
                System.out.println("La suma de la fila 2 es " +suma2);
                }
            }
        }
        
    }
    
}
