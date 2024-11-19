public class q17{
    public static void main(String[] args) {
        // Input number
        int num = 2415; 
        String str = String.valueOf(num);
        int sum = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            String pair = str.substring(i, i + 2); 
            sum += Integer.parseInt(pair);
        }

        System.out.println("Sum of consecutive digits: " + sum);
    }
}
