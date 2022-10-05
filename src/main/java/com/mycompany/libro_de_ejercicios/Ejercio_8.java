
package com.mycompany.libro_de_ejercicios;

import java.util.Scanner;

public class Ejercio_8 {
    //Lizarraga Paquiyauri Kevin
    public static void main(String[] args) {
        //8. Pedir dos números y decir cual es el mayor o si son iguales.
        Scanner sc = new Scanner (System.in);
        int n1,n2;
        System.out.print("Introduce un número: ");
        n1 = sc.nextInt();
        System.out.print("Introduce otro número: ");
        n2 = sc.nextInt();
        if(n1==n2)
        System.out.println("Son iguales");
        else
        {
        if(n1>n2)
        System.out.println(n1 + " es mayor que " + n2);
        else
        System.out.println(n2 + " es mayor que " + n1);
        }
    }
}
