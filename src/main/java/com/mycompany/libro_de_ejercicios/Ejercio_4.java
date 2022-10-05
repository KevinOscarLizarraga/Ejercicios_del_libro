
package com.mycompany.libro_de_ejercicios;

import java.util.Scanner;

public class Ejercio_4 {
    //Lizarraga Paquiyauri Kevin
    public static void main(String[] args) {
        // Pedir dos números y decir si son iguales o no.
        Scanner sc = new Scanner (System.in);
        int n1,n2;
        System.out.print("Introduce un número: ");
        n1 = sc.nextInt();
        System.out.print("Introduce otro número: ");
        n2 = sc.nextInt();
        if(n1==n2)
        System.out.println("Son iguales");
        else
        System.out.println("No son iguales");
    }
}
