package something.packageA;


import something.packageB.*;

public class A extends B {
    public static void b(String[] args) {
        B b = new B();
        System.out.println(b.publicMessage);
        A a = new A();
        System.out.println(a.protectedString);

    }
}
