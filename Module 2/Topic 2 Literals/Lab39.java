public class Lab39 {
    public static void main(String[] args) {
        String str1 = null;

        System.out.println(str1); // null

        int x = str1.length(); // NullPointerException
        System.out.println(x); // This line will not be executed
    }
}
