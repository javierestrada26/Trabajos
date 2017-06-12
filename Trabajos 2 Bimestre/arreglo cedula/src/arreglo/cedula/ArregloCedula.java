
package arreglo.cedula;

import java.util.Scanner;
public class ArregloCedula {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] cedula;
        int n,i;
        int sum, sum1,op,op1,op2,total;
        System.out.println("Ingrese el limite de la lista");
        n= entrada.nextInt();
        cedula = new int [n];
        for( i=0; i<cedula.length; i++){
            System.out.println("Ingrese el valor de la  lista []" +i);
            cedula[i]= entrada.nextInt();
            
        }
        //operaciones
        cedula[0]= cedula[0]*2;
        if(cedula[0]>9){
            cedula[0]=(cedula[0]-9);
        }
        cedula[2]= cedula[2]*2;
        if(cedula[2]>9){
            cedula[2]=(cedula[2]-9);
        }
        cedula[4]= cedula[4]*2;
        if(cedula[4]>9){
            cedula[4]=(cedula[4]-9);
        }
        cedula[6]= cedula[6] *2;
        if(cedula[6]>9){
            cedula[6]=(cedula[6]-9);
        }
        cedula[8]= cedula[8] *2;
        if(cedula[8]>9){
            cedula[8]=(cedula[8]-9);
        }
        sum=cedula[0]+cedula[2]+cedula[4]+cedula[6]+cedula[8];
        cedula[1]= cedula[1]*1;
        cedula[3]=cedula[3]*1;
        cedula[5]=cedula[5]*1;
        cedula[7]=cedula[7]*1;
        sum1=cedula[1]+cedula[3]+cedula[5]+cedula[7];
        op= sum+sum1;
        op1=op%10;
        op2=op-op1+10;
        //Resultados
        System.out.println("El numero que se incrementa es " +op2);
        total = op2-op;
        System.out.println(+total);
        if(total==cedula[9]){
            System.out.println("Su numero de cédula es correcto");
        }
        else{
            System.out.println("Su número de cédula es incorrecto");
        }
    }
    
}
