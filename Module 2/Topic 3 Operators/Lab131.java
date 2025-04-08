public class Lab131 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = a > b ? a : b; // Ternary operator
        System.out.println("Max: " + max); // Max: 20
        int min = a < b ? a : b; // Ternary operator
        System.out.println("Min: " + min); // Min: 10
    }
}
