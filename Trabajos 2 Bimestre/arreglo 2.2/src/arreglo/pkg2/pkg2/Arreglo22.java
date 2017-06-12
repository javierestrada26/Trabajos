
package arreglo.pkg2.pkg2;

import java.util.Scanner;
public class Arreglo22 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int [] n;
        int l, menor,i;
        System.out.println("Ingrese el limite de la lista");
        l = entrada.nextInt();
        n = new int [l];
        for( i=0; i<n.length; i++){
            System.out.println("Ingrese el valor de la  lista []" +i);
            n[i]= entrada.nextInt();
           
        }
        //Obtener el mayor
       menor = n[0];
        for(i=0;i<n.length;i++){
            if (n[i]<menor){
                menor = n[i];
                
            }  
        }
        
        System.out.println("El menor número del array es " +menor);
        
    }
    
}
