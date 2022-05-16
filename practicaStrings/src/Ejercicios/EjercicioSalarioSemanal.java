package Ejercicios;

import java.util.Scanner;

public class EjercicioSalarioSemanal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float salario;
        float horasT;
        float totalSalarioT;

        System.out.println( "Ingrese su salario semanal ");
        salario = sc.nextFloat();
        System.out.println( "Ingrese sus horas trabajadas");
        horasT = sc.nextFloat();

        System.out.println( "Su salario es " + (salario/48) * horasT);


    }
}
