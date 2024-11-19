public class ConstructorOverloading {
    public ConstructorOverloading() {
        System.out.println("No-argument constructor called.");
    }

    public ConstructorOverloading(int value) {
        System.out.println("Parameterized constructor called with value: " + value);
    }

    public static void main(String[] args) {
        ConstructorOverloading overloaded1 = new ConstructorOverloading();
        ConstructorOverloading overloaded2 = new ConstructorOverloading(42);
    }
}
