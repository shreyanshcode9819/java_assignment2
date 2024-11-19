class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}

class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class q23 {
    public static void main(String[] args) {
        int temperature = 40; // Example temperature

        try {
            if (temperature > 35) {
                throw new TooHot("Temperature is too hot!");
            } else if (temperature < 5) {
                throw new TooCold("Temperature is too cold!");
            } else {
                System.out.println("Normal temperature: " + ((temperature * 9 / 5) + 32) + "°F");
            }
        } catch (TooHot | TooCold e) {
            System.out.println(e.getMessage());
        }
    }
}
