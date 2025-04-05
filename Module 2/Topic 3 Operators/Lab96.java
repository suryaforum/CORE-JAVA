class Lab96 {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 13;

        // byte b3 = byte(b1 + b2); // This will cause a compile-time error
        // byte b3 = (byte) b1 + (byte) b2;
        byte b3 = (byte) (b1 + b2); // Correct way to cast the result of an addition
        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);
        System.out.println("b3: " + b3);
    }
}
