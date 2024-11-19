class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class q21 {
    public static void main(String[] args) {
        String country = "Unknown"; // Input country
        try {
            if (country.equals("India")) {
                System.out.println("Capital: New Delhi");
            } else {
                throw new NoMatchFoundException("No match found for country: " + country);
            }
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
