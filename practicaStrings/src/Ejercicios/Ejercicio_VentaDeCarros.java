package Ejercicios;

import java.util.Scanner;

public class Ejercicio_VentaDeCarros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        float numAutos;
        float valorAut;
        float salario = 1000;
        float comision = 150;
        double comision2 = 0.05;

        System.out.println("Ingrese numero de autos vendidos");
        numAutos = sc.nextFloat();

        System.out.println("ingrese el valor total de autos vendidos");
        valorAut = sc.nextFloat();

        double valorFinal = (salario + ((numAutos * comision) + (valorAut * comision2)));
        System.out.println(" El salario mensual del vendedro es " + valorFinal);
*/

        final double salario = 1000;
        double comision = 0;
        double porcentaje = 0.05;
        double totalVenta =0;

        System.out.println("Cuantos carros va a vender");
        int cantVenta = sc.nextInt();

        for (int i =0;i<cantVenta;i++){
            System.out.println("ingrese el valor del vehiculo numero :"+ (i+1));
            double precioAuto = sc.nextDouble();
            comision = comision + 150;
            totalVenta = totalVenta + precioAuto;
        }

        double salarioM= ((totalVenta*porcentaje)+salario)+comision;

        System.out.println("el salario es :" + salarioM);



    }
}
