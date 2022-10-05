
package com.mycompany.libro_de_ejercicios;

import java.util.Scanner;

public class Ejercio_6 {
    //Lizarraga Paquiyauri Kevin
    public static void main(String[] args) {
        //6. Pedir dos números y decir si uno es múltiplo del otro.
        Scanner sc = new Scanner (System.in);
        int n1,n2;
        System.out.print("Introduce un número: ");
        n1 = sc.nextInt();
        System.out.print("Introduce otro número: ");
        n2 = sc.nextInt();
        if(n1%n2==0)
        System.out.println("Son múltiplos");
        else
        System.out.println("No son múltiplos");
    }
}
