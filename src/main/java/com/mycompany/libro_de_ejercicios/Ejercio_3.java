
package com.mycompany.libro_de_ejercicios;

import java.util.Scanner;

public class Ejercio_3 {
    //Lizarraga Paquiyauri Kevin
    public static void main(String[] args) {
        //3. Pedir el radio de una circunferencia y calcular su longitud.
        Scanner sc = new Scanner (System.in);
        double l,r; // longitud y radio
        System.out.print("Introduce el radio de una circunferencia: ");
        r = sc.nextInt();
        l = 2*Math.PI*r;
        System.out.println("La longitud de una circunferencia de radio " + r+ " es: " + l);
    }
}
