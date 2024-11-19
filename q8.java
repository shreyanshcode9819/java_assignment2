class ParentClass1 {
    public static void methodHiding() {
        System.out.println("Parent class static method.");
    }
}

class ChildClass extends ParentClass1 {
    public static void methodHiding() {
        System.out.println("Child class static method.");
    }

    public static void main(String[] args) {
        ParentClass1.methodHiding();
        ChildClass.methodHiding();
    }
}

