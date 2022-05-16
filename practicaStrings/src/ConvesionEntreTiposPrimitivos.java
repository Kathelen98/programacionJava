public class ConvesionEntreTiposPrimitivos {
    public static void main(String[] args) {

        int i = 32767;
        short s = (short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);


    }
}
