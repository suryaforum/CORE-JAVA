public class Lab102 {
    public static void main(String[] args) {
        int a = 90;
        a *= 3 + 4;
        System.out.println(a); // This will print 630

        int b = 10;
        b = b * 3 + 4; // This will print 34
        System.out.println(b); // This will print 34

        int c = 10;
        c = c * (3 + 4); // This will print 70
        System.out.println(c); // This will print 70
    }
}
