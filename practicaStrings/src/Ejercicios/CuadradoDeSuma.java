package Ejercicios;

import java.util.Scanner;

public class CuadradoDeSuma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float a;
        float b;

        System.out.println("Ingrese el valor de A");
        a = sc.nextFloat();
        System.out.println("Ingrese el valor de B");
        b = sc.nextFloat();

        // (a+b)2 = a2 + b2 + 2ab
        float formulaF = ((a*a) + (b*b) + ((2*a*b)));
        System.out.println("El resultado es " + formulaF);


    }
}
