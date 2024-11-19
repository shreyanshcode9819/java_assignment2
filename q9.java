abstract class ThreeDObject {
    public abstract double wholeSurfaceArea();
    public abstract double volume();
}

class Box extends ThreeDObject {
    private double length, width, height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    public double volume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        Box box = new Box(2, 3, 4);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());
    }
}

    

