

public class EjemplosStringInmutable {
    public static void main(String[] args) {

        String curso = "Programacion Java";
        String profesor = "Andres Caro";

        String resultado = curso.concat(" con " + profesor);
        System.out.println("curso = " + curso);
        System.out.println("profesor = " + profesor);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        curso.transform(c -> {
            return c + "con" + profesor;

        });


    }
}
