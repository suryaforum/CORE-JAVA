public class Lab121 {
    public static void main(String[] args) {
        int a = 12;
        boolean b = a > 15 || a++ < 5;
        // a > 15 is false, but a++ < 5 is true
        // a > 15 is false, so a++ < 5 is evaluated
        System.out.println(a); // 13
        // a is incremented to 13 because a++ < 5 is true
        System.out.println(b); // true
        // a > 15 is false, but a++ < 5 is true
    }
}