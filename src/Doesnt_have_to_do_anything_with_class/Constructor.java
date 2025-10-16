package Doesnt_have_to_do_anything_with_class;

public class Constructor {
    public static void main(String[] args) {
    Abc a = new Abc();
    Abc b = new Abc(5);
    }
}

class Abc {
    int a;

    Abc() {
        System.out.println("Hello World");
    }

    Abc(int a) {
        this.a = a;
        System.out.println(a);
    }
}
