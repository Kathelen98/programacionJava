package Ejercicios;

import java.util.Scanner;

public class Ejercicio_Calificaciones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double participacion;
        double primerExamen;
        double parcial;
        double segundoExamen;

        System.out.println("Ingrese la nota de la participación");
        participacion = sc.nextDouble();

        System.out.println("Ingrese la nota del primer examen");
        primerExamen = sc.nextDouble();

        System.out.println("Ingrese la nota del parcial");
        parcial = sc.nextDouble();

        System.out.println("Ingrese la nota del segundo examen");
        segundoExamen = sc.nextDouble();

        double notaF = ((parcial * 0.10)+(primerExamen * 0.25)+(parcial * 0.40) + (segundoExamen * 0.25));
        System.out.println("Su nota final es " + notaF);


    }
}
