public class Lab106 {
    public static void main(String[] args) {
        byte b = 127;
        b = b + 1;
        System.out.println(b); // This will print -128
        // The above line will cause a compilation error because the result of b + 1 is
        // an int, which cannot be assigned to a byte without explicit casting.
    }
}
