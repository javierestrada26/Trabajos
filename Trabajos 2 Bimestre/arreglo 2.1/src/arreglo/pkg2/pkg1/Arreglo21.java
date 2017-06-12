
package arreglo.pkg2.pkg1;
import java.util.Scanner;
public class Arreglo21 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double promedio=0;
        int [] n;
        int l,suma=0, mayor,i;
        System.out.println("Ingrese el limite de la lista");
        l = entrada.nextInt();
        n = new int [l];
        for( i=0; i<n.length; i++){
            System.out.println("Ingrese el valor de la  lista []" +i);
            n[i]= entrada.nextInt();
            //Operaciones
            suma=suma+n[i];
            promedio = suma /l;
        }
        //Obtener el mayor
        mayor = n[0];
        for(i=0;i<n.length;i++){
            if (n[i]>mayor){
                mayor = n[i];
                
            }  
        }
        System.out.println("La suma del array es " +suma);
        System.out.println("El promedio del array es " +promedio);
        System.out.println("El mayor número del array es " +mayor);
        
    }
    
}
