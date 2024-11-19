class ParentClass {
    public void show() {
        System.out.println("This is the parent class.");
    }
}

class ChildClass extends ParentClass {
    @Override
    public void show() {
        System.out.println("This is the child class.");
    }

    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        parent.show();

        ChildClass child = new ChildClass();
        child.show();
    }
}
