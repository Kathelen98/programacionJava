 package strings;

public class EjemplosStringConcatenacion {
    public static void main(String[] args) {

        String curso = "Programacion Java";
        String profesor = "Andre Caro";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println("detalle = " + detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + (numeroA + numeroB));
        System.out.println(numeroA + numeroB + detalle);

        String detalle2 = curso.concat(" con " + profesor);
        System.out.println("detalle2 = " + detalle2);






    }
}
