public class Lab15 {
    public static void main(String[] args) {
        final int A;
        A = 99; // Assigning a value to the final variable
        System.out.println("A: " + A); // Output: A: 99
        A = 88; // This line will cause a compilation error
        System.out.println("A: " + A); // Output: A: 88
        // The above line will cause a compilation error because A is declared as final
        // and cannot be reassigned.
    }
}
