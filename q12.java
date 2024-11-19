class Distance {
    double miles;

    Distance(double miles) {
        this.miles = miles;
    }

    void travelTime() {
        System.out.println("Time (in hours) to cover " + miles + " miles at 60 mph: " + (miles / 60));
    }
}

class DistanceMKS extends Distance {
    DistanceMKS(double kilometers) {
        super(kilometers);
    }

    @Override
    void travelTime() {
        System.out.println("Time (in hours) to cover " + miles + " km at 100 km/h: " + (miles / 100));
    }
}

public class q12 {
    public static void main(String[] args) {
        Distance dist1 = new Distance(120);
        DistanceMKS dist2 = new DistanceMKS(200);

        dist1.travelTime();
        dist2.travelTime();
    }
}
