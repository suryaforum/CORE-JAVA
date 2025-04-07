public class Lab120 {
    public static void main(String[] args) {
        int a = 12;
        boolean b = a > 10 || a++ < 5;
        // a > 10 is true, so a++ < 5 is not evaluated
        System.out.println(a); // 12
        System.out.println(b); // true
    }
}
