import java.util.Scanner;

public class SumaDeNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        System.out.println("ingrese tres nota");
        nota1= sc.nextDouble();
        nota2= sc.nextDouble();
        nota3= sc.nextDouble();

        double resultado = nota1 + nota2 + nota3;
        System.out.println("resultado = " + resultado);



    }
}
