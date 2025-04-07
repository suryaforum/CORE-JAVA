public class lab119 {
    public static void main(String[] args) {
        int a = 12;
        boolean b = a > 15 && a++ < 5;
        // a > 10 is true, but a++ < 5 is false
        System.out.println(a); // 12
        System.out.println(b); // false
        // a > 15 is false, so a++ < 5 is not evaluated
    }
}
