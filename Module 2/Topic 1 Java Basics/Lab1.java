class Hello {
    boolean b1;

    byte b2;
    short s;
    int a;
    long b;

    float f;
    double d;

    Hello h;
    String str;

    void show() {
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("s = " + s);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("h = " + h);
        System.out.println("str = " + str);
    }
}

class Lab1 {

    // This is the main method which is the entry point of the program.
    public static void main(String[] args) {
        Hello h = new Hello();
        h.show();
    }
}
