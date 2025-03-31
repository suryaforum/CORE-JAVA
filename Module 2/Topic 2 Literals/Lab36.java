public class Lab36 {
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 65;

        char ch3 = '\u0041'; // Unicode representation of 'A'
        char ch4 = '\101'; // Octal representation of 65

        System.out.println(ch1); // A
        System.out.println(ch2); // A (65 in decimal)
        System.out.println(ch3); // A (Unicode for 'A')
        System.out.println(ch4); // A (Octal for 65)
    }
}
