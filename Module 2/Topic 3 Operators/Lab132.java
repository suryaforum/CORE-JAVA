public class Lab132 {
    public static void main(String[] args) {
        int a = 10;
        int b = 23;
        int c = 12;
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c); // Ternary operator
        System.out.println("Max: " + max); // Max: 23
    }
}
