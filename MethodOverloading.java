public class MethodOverloading {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloading example = new MethodOverloading();
        System.out.println("Sum of 2 and 3: " + example.add(2, 3));
        System.out.println("Sum of 2, 3, and 4: " + example.add(2, 3, 4));
    }
}
