public class Lab38 {
    public static void main(String[] args) {
        char ch1 = '\101'; // 'A'
        char ch2 = '\378'; // Invalid octal escape sequence, should be '\040' for space or '\041' for '!'

        System.out.println(ch1);
        System.out.println(ch2); // This will cause a compile-time error due to invalid escape sequence
    }
}
