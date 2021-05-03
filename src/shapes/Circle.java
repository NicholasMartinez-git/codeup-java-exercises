package shapes;
import util.Input;

public class Circle {
    private static double radius;

    public Circle (double radius) {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }

    public static double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    public static double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
