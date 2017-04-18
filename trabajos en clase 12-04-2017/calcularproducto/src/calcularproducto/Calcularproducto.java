
package calcularproducto;
import java.util.Scanner;
public class Calcularproducto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //Declarar variables
        int cant_pro1,cant_pro2,cant_pro3;
        double valor_pro1,valor_pro2,valor_pro3;
        double iva;
        double sub_total,sub_total2;
        double total;
        double op_valor1,op_valor2,op_valor3;
        //iniciar variables
        cant_pro1=0;
        cant_pro2=0;
        cant_pro3=0;
        iva = 0.14;
        sub_total=0;
        total=0;
        valor_pro1=2.5;
        valor_pro2=7.25;
        valor_pro3=4;
        op_valor1=0;
        sub_total2=0;
        //Soicitar variables
        System.out.println("Ingrese cantidad de producto1");
        cant_pro1 = entrada.nextInt();
        System.out.println("Ingrese cantidad de producto2");
        cant_pro2 = entrada.nextInt();
        System.out.println("Ingrese cantidad de producto3");
        cant_pro3 = entrada.nextInt();
        //operaciones
        op_valor1 = cant_pro1 *valor_pro1;
        op_valor2 = cant_pro2 *valor_pro2;
        op_valor3 = cant_pro3 *valor_pro3;
        sub_total= op_valor1+op_valor2+op_valor3;
        sub_total2=sub_total * iva;
        total=sub_total+sub_total2;
        System.out.println("El precio total es de " +total);
    }
    
}
