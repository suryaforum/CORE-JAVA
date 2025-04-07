public class Lab107A {
    public static void main(String[] args) {
        int a = 10;

        int b = a++;
        int c = a++;
        int d = ++a;
        int e = --a;
        int f = a--;
        int g = ++a;

        System.out.println(a); // This will print 10
        System.out.println(b); // This will print 10
        System.out.println(c); // This will print 11
        System.out.println(d); // This will print 12
        System.out.println(e); // This will print 11
        System.out.println(f); // This will print 10
        System.out.println(g); // This will print 11
    }
}
