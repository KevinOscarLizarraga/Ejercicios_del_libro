
package com.mycompany.libro_de_ejercicios;

import java.util.Scanner;

public class Ejercio_2 {
    //Lizarraga Paquiyauri Kevin
    public static void main(String[] args) {
        //2. Pedir la radio de un círculo y calcular su área. A=PI*r^2.
        double a,r; // área y radio
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce el radio de un circulo: ");
        r = sc.nextInt();
        a = Math.PI*(r*r); 
        // para elevar al cuadrado otra opción es: Math.pow (r, 2)
        System.out.println("El área de una circunferencia de radio " + r + " es: " + a);
    }
}
