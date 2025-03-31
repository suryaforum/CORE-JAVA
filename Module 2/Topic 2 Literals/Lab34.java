public class Lab34 {
    public static void main(String[] args) {
        char ch1 = -1;
        char ch2 = 65536;

        System.out.println(ch1); // -1
        System.out.println(ch2); // 65536
        // The above two lines will not compile because char cannot be negative or
        // greater than 65535.
    }
}
