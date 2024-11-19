class GrandParent {
    void sayHello() {
        System.out.println("Hello from GrandParent.");
    }
}

class Parent extends GrandParent {
    void sayHi() {
        System.out.println("Hi from Parent.");
    }
}

class Child extends Parent {
    void sayHey() {
        System.out.println("Hey from Child.");
    }
}

public class q13 {
    public static void main(String[] args) {
        Child child = new Child();
        child.sayHello();
        child.sayHi();
        child.sayHey();
    }
}
