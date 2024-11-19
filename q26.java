
import java.util.Scanner;

class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class q26 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        String name;
        System.out.println("enter your name " );
        name=scn.nextLine();
        int age; 
        System.out.println("enter your age " );
        age=scn.nextInt();
        

        try {
            if (age < 0) {
                throw new NegativeAgeException("Age cannot be negative.");
            }
            System.out.println("Name: " + name + ", Age: " + age);
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
