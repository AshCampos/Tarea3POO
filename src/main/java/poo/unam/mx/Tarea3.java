
package poo.unam.mx;

import java.util.Scanner;


public class Tarea3 {
    public static void main(String[] args) {
         System.out.println("JUEGO DEL GATO");
        System.out.println("Solo se aceptan X O _ ");

        	System.out.println("Introduzca 9 caracteres: ");
        	Scanner in= new Scanner(System.in);
            String teclado = in.nextLine();
            String datos = teclado.toUpperCase();
            System.out.println(datos);
            // separar los datos introducidos 
            String[]separar = datos.split("");
                       
            int condicion = 0;
            for (int i = 0; i < separar.length; i++) {
                if (separar[i].equals("X") || separar[i].equals("O") || separar[i].equals("_")) {
                   condicion = condicion + 1;
                }
            }
            //imprimir los datos introducidos en los arreglos
            int separados = 0;
            if(datos.length( ) ==  9){
                if (condicion == 9) {
                    separados = 0;
                    for (int j = 0; j < 5; j++) {
                        if (j == 0 || j == 4) {
                            System.out.println("-------------");
                                              }
                        else {
                            System.out.println("|  " + separar[0 + separados] + "  " + separar[1 + separados] + "  " + separar[2 + separados] + "  |");
                            separados += 3;
                             }
                                                } 
               
                                    }
                                     }
    }
}
    

