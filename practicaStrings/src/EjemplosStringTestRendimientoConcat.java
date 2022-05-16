 package strings;

public class EjemplosStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicial = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            //c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1000 => 10ms
            //c += a + b + "\n"; // 500 => 4ms, 1000 => 14ms
            sb.append(a).append(b).append("\n"); // 500 => 1 ms, 1000 => 2ms, 10000 => 4ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicial);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb);






    }
}
