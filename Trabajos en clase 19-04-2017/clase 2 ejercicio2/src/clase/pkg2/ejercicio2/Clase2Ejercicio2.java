
package clase.pkg2.ejercicio2;
import java.util.Scanner;
public class Clase2Ejercicio2 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declarar variables
        double nota1,nota2;
        double asistencia;
        double resultado,suple,suple2;
        int opcion;
        //iniciar variables
        nota1 =0;
        suple=0;
        suple2=0;
        nota2 =0;
        resultado =0;
        asistencia =0;
        //Pedir variables
        System.out.println("Ingrese nota del primer bimestre");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese nota del segundo bimestre");
        nota2 = entrada.nextDouble();
        System.out.println("Ingrese nota de asistencia");
        asistencia = entrada.nextDouble();
        //Calculos
        resultado = nota1 + nota2;
        //condiciones
        if((resultado>28) && (asistencia>47)){
            System.out.println("Usted aprobó el ciclo");
        }
        else{
            if(nota1<nota2){
                System.out.println("Usted debe rendir el supletorio del primer bimestre\n");
                
            }
            if(nota2<nota1){
                 System.out.println("Usted debe rendir el supletorio del segundo  bimestre\n");
            }
            System.out.println("¿Qué bimestre quiere recuperar?");
            System.out.println("Bimestre 1--> opcion1");
            System.out.println("Bimestre 2-->opcion2");
            System.out.println("Los dos bimestres-->opcion3");
            opcion =entrada.nextInt();
            if(opcion==1){
            
                System.out.println("Ingrese su nota de supletorio");
                suple = entrada.nextDouble();
            if((suple+nota2)>27){
                System.out.println("Felicidades pasó");
            }
            else{
                System.out.println("Usted reprobó el ciclo");
            }
            
            }
            if(opcion==2){
            
                System.out.println("Ingrese su nota de supletorio");
                suple = entrada.nextDouble();
            if((suple+nota1)>27){
                System.out.println("Felicidades pasó");
            }
            else{
                System.out.println("Usted reprobó el ciclo");
            }
            
            }
            if(opcion==3){
                System.out.println("ingrese nota del primer supletorio");
                suple=entrada.nextDouble();
                System.out.println("ingrese nota del segundo bimestre supletorio");
                suple2=entrada.nextDouble();
                if((suple+suple2)>=28){
                    System.out.println("Felicidades pasó");
                }
                else{
                    System.out.println("Usted reprobó");
                }
            }
        }
        
    }
    
}
