public class Lab98 {
    public static void main(String[] args) {
        boolean b = (boolean) 1; // This will cause a compile-time error
        String str = (String) 99; // This will cause a compile-time error
        int x = (int) "Hello"; // This will cause a compile-time error
    }
}
