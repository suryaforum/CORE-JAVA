class Hello {
    char ch;

    void show() {
        System.out.println(ch);
        System.out.println(ch == 0); // ASCII value of 0 is 48
        System.out.println(ch == '0'); // 0 or ASCII 48
        System.out.println(ch == 48); // ASCII 48
        System.out.println(ch == ' '); // ASCII 32
        System.out.println(ch == 32); // ASCII 32
    }
}

class Lab2 {
    public static void main(String[] args) {
        Hello h = new Hello();
        h.show();
    }
}
