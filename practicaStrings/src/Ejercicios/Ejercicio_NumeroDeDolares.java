package Ejercicios;

import java.util.Scanner;

public class Ejercicio_NumeroDeDolares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float gillermo;

        System.out.println("Ingrese la cantidad de dolares que tiene Gillermo");
        gillermo = sc.nextFloat();
        float luis = gillermo/2;
        float juan = (gillermo + luis)/2;
        System.out.println("Luis tiene " + luis + " Dolares " + "juan tiene " + juan + " Dolares ");
        System.out.println("gillermo tiene " + gillermo + " Dolares ");
        System.out.println( "todos tienen " + (gillermo + luis+juan) + " Dolares ");
    }
}
