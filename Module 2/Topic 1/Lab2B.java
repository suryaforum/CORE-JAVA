//  ASCIII characters from 32 to 126

class Lab2B {
    public static void main(String[] args) {
        for (int i = 32; i <= 126; i++) {
            char ch = (char) i;
            System.out.println(i + " : " + ch);
        }
    }
}
