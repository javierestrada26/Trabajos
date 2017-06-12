
package arreglo.bidimensional;

import java.util.Scanner;
public class ArregloBidimensional {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int matriz[][],i,n;
        
        //Llenado de matriz de forma manual
         //matriz[0][0] =1;
         //Resultado
         //System.out.println("Matriz " +matriz[1][2]) muestra el resultado de la matriz ;
         
         System.out.println("Ingrese el limite de la matriz");
         int lim = entrada.nextInt();
         matriz = new int [lim][lim];
         System.out.println("Llenado de matriz");
         //aplicando un for 
         for(i=0;i<lim;i++){//esta muestra las columnas
             for(int x=0;x<lim;x++){//muestra las filas
                 matriz[i][x]=entrada.nextInt();
                 //System.out.println("" +matriz[i][x]);
             }
         }
         
         System.out.println("\nPresentamos la matriiz");
         for(i=0;i<lim;i++){//esta muestra las columnas
             for(int x=0;x<lim;x++){//muestra las filas
                 
                 System.out.print(matriz[i][x]+"");
    }
                 System.out.print("");
}
         //Presentamos fila inferior
         System.out.println("\nPresentación de la fila inferior de la matriz");
         for(int x=0;x<lim;x++){
             System.out.println(matriz[lim-1][x]+"");
         }
         //Presentamos la diagonal
         System.out.println("Presentación de la diagonal principal de la matriz");
         for( i=0;i<lim;i++){
             for(int x=0;x<lim;x++){
                 if(i==x){
                     System.out.println(matriz[i][x]+" ");
                 }
             }
         }
         //Presentamos la diagonal secundaria
         System.out.println("Presentación de la diagonal secundaria de la matriz");
         for( i=0;i<lim;i++){
             for(int x=0;x<lim;x++){
                 if(i+x==lim-1){
                     System.out.println(matriz[i][x]+" ");
                 }
             }
         }
         //Presentamos elementos sobre la diagonal principal 
         System.out.println("Presentación de los elemnetos sobre diagonal principal de la matriz");
         for( i=0;i<lim;i++){
             for(int x=0;x<lim;x++){
                 if(i<x){
                     System.out.println(matriz[i][x]+" ");
                 }
             }
         }
         //Presentación de elementos sobre la diagonal secundaria 
         System.out.println("Presentación de los elemnetos sobre diagonal secundaria de la matriz");
         for( i=0;i<lim;i++){
             for(int x=0;x<lim;x++){
                 if(i+x<lim-1){
                     System.out.println(matriz[i][x]+" ");
                 }
             }
         }
         //Presentación de elementos debajo la diagonal principal
         System.out.println("Presentación de los elemnetos debajo de la diagonal principal  de la matriz");
         for( i=0;i<lim;i++){
             for(int x=0;x<lim;x++){
                 if(i>x){
                     System.out.println(matriz[i][x]+" ");
                 }
             }
         }
         //Presetación de elementos debajo de la diagonal secundaria
         System.out.println("Presentación de los elemnetos debajo de la diagonal secundaria de la matriz");
         for( i=0;i<lim;i++){
             for(int x=0;x<lim;x++){
                 if(i+x>=lim){
                     System.out.println(matriz[i][x]+" ");
                 }
             }
         }
         //Presentación de elementos en zig zag de la matriz
         //System.out.println("Presentación de los elementos en zig zag");
         
    }
    public static void leermatriz(){
        System.out.println("Sludo desde la función");
    }
}