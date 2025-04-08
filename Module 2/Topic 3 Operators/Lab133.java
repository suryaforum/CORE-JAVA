public class Lab133 {
    public static void main(String[] args) {
        int a = 19;
        System.out.println(a << 1);
        System.out.println(a << 1);
        System.out.println(a >> 1);
        System.out.println(a >> 2);

        int x = 15;
        int y = 17;
        System.out.println(x & y); // Bitwise AND
        System.out.println(x | y); // Bitwise OR
        System.out.println(x ^ y); // Bitwise XOR
        System.out.println(~x); // Bitwise NOT
        System.out.println(~y); // Bitwise NOT
        System.out.println(0101 << 1);
        System.out.println(0101 >> 2);
    }
}
