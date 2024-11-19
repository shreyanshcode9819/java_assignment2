import java.util.Scanner;

class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}

class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class q24 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("enter your name");
        String candidateName ;
        candidateName=scn.nextLine();
        System.out.println("enter your age");
        int age ;
        age=scn.nextInt();

        try {
            if (age > 45) {
                throw new TooOlder("Candidate is too old.");
            } else if (age < 20) {
                throw new TooYounger("Candidate is too young.");
            } else {
                System.out.println(candidateName + " is eligible.");
            }
        } catch (TooOlder | TooYounger e) {
            System.out.println(e.getMessage());
        }
    }
}
