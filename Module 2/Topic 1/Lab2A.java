class Hello {
    char ch = 65;
    int a = 65;

    void show() {
        System.out.println(ch);
        System.out.println(a);
    }
}

class Lab2A {
    public static void main(String[] args) {
        Hello h = new Hello();
        h.show();
    }
}
