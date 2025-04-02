public class Lab74 {

    public static void main(String[] args) {
        final byte b1 = 12;
        final byte b2 = 23;
        byte b3 = b1 + b2; // Implicitly casted to int

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}