public class Lab95 {
    public static void main(String[] args) {
        int a = 300;
        byte b = (byte) a; // Explicit cast from int to byte

        System.out.println(a);
        System.out.println(b); // This will print a value that may not be the same as 'a' due to overflow
    }
}
