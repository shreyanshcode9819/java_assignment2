class Vehicle {
    protected String regnNumber, color, ownerName;
    protected int speed;

    public Vehicle(String regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    public void showData() {
        System.out.println("This is a vehicle class.");
    }
}

class Bus extends Vehicle {
    private int routeNumber;

    public Bus(String regnNumber, int speed, String color, String ownerName, int routeNumber) {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Route Number: " + routeNumber);
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
    }
}

class Car extends Vehicle {
    private String manufacturerName;

    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Manufacturer Name: " + manufacturerName);
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
    }

    public static void main(String[] args) {
        Bus myBus = new Bus("AB1234", 80, "Red", "John Doe", 25);
        myBus.showData();
        
        Car myCar = new Car("CD5678", 100, "Blue", "Jane Smith", "Toyota");
        myCar.showData();
    }
}

