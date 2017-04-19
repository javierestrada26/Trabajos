
package ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        char departamento ;
        //Pedir variables
        System.out.println("Ingrese departamento requerido");
        departamento = entrada.next().charAt(0);
        switch(departamento){
            case 'A':
                System.out.println("Desarrollo");
                break;
            case 'B':
                System.out.println("Recursos Humanos");
                break;
            case 'C':
                System.out.println("Finanzas");
                break;
            default:
                System.out.println("Departamento invalido");
        }
        System.out.println("Código para departamento es " +departamento);
    }
    
}
