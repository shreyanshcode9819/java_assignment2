import java.util.Scanner;

class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

public class q25 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);

        String username ;
        String password ;
        String confirmPassword;
        System.out.println("enter your username : ");
        username=scn.nextLine();
        System.out.println("enter your password : ");
        password=scn.nextLine();
        System.out.println("confirm your password : ");
        confirmPassword=scn.nextLine();

        try {
            if (username.length() < 6) {
                throw new InvalidCredentialsException("Username must be at least 6 characters long.");
            }
            if (!password.equals(confirmPassword)) {
                throw new InvalidCredentialsException("Passwords do not match.");
            }
            System.out.println("User credentials are valid.");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
    }
}
