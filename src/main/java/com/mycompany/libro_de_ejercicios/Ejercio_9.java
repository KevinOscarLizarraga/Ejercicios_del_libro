
package com.mycompany.libro_de_ejercicios;

import java.util.Scanner;

public class Ejercio_9 {
    //Lizarraga Paquiyauri Kevin
    public static void main(String[] args) {
        //9. Pedir dos números y mostrarlos ordenados de mayor a menor
        Scanner sc = new Scanner (System.in); 
        int n1,n2;
        System.out.print("Introduce un número: ");
        n1 = sc.nextInt();
        System.out.print("Introduce otro número: ");
        n2 = sc.nextInt();
        if(n1>n2)
        System.out.println(n1 + " y " + n2);
        else
        System.out.println(n2 + " y " + n1); 
    }
}
