
package com.mycompany.libro_de_ejercicios;

import java.util.Scanner;

public class Ejercio_5 {
    //Lizarraga Paquiyauri Kevin
    public static void main(String[] args) {
        //5. Pedir un número e indicar si es positivo o negativo
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        if( num < 0)
        System.out.println("Negativo");
        else
        // suponemos que el 0 es positivo.
        System.out.println("Positivo");
    }
}
