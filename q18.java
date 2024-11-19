interface A {
    void methodA();
}

interface B {
    void methodB();
}

interface C {
    void methodC();
}

interface D extends A, B, C {
    void methodD();
}

class InterfaceDemo implements D {
    @Override
    public void methodA() {
        System.out.println("Method A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B");
    }

    @Override
    public void methodC() {
        System.out.println("Method C");
    }

    @Override
    public void methodD() {
        System.out.println("Method D");
    }
}

public class q18 {
    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        obj.methodA();
        obj.methodB();
        obj.methodC();
        obj.methodD();
    }
}

