public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[-1] = 10; // Will throw NegativeArrayIndexException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            int result = 10 / 0; // Will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}
