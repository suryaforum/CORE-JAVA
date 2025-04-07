public class Lab105 {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        System.out.println(a); // This will print 11
        System.out.println(b);

        int x = 10;
        int y = ++x;
        System.out.println(x); // This will print 11
        System.out.println(y); // This will print 11
    }
}
