public class ParamConstructor {
    public ParamConstructor(String message) {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        ParamConstructor paramExample = new ParamConstructor("Hello!");
    }
}

