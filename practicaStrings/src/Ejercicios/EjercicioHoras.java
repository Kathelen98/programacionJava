package Ejercicios;

import java.util.Scanner;

public class EjercicioHoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasT;

        System.out.println("Ingrese el numero de horas total");
        horasT = sc.nextInt();

        int semanas = horasT/168;
        int dias = horasT%168/24;
        int horas = horasT%24;

        System.out.println("El equivalente es " + semanas + " Semanas " + dias + " dias " + horas + " Horas ");







    }
}
