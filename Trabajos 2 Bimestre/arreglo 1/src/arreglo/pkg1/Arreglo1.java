
package arreglo.pkg1;

import java.util.Scanner;
public class Arreglo1 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int[] lista;
        int n,i,fac=1,c=1,j;
        System.out.println("Ingrese el límite de la lista ");
        n = entrada.nextInt();
                   
        lista = new int [n];
        for( i=0; i<lista.length; i++){
            System.out.println("Ingrese el valor de la  lista []" +i);
            lista[i]= entrada.nextInt();
        }
         for( i=0;i<lista.length;i++){
            if(lista[i]%2!=0 ){
                System.out.println("Lista " +lista[i]+ "es impar" );
                if(lista[i]<5){
                    j=lista[i];
                    while(j!=0){
                        fac = fac*j;
                        j--;
                    }
                    System.out.println("lista " +lista[i]+ "su factorial es " +fac);
                }
                
          fac =1;
            }
            
    }
    }
    
}
