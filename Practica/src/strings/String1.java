package strings;

public class String1 {
    public static void main(String[] args) {

        String nombre = "Andres";
        String apellido = "Caro";
        String nombreCompleto = nombre + apellido;

        System.out.println("nombre Completo = " + nombreCompleto);
        System.out.println(nombreCompleto.length());

        String str1 ="Hola Andres";
        String str2 = new String("Hola Andres");

        //Chequea si es el  mismo objeto
        System.out.println("Son el mismo objeto?" + (str1 == str2));

        //Chaquea si tienen el mismo valor
        System.out.println("Tienen el mismo valor?" + str1.equals(str2));



    }
}
