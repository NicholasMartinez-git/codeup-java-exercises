package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Please enter a radius: ");
        double radius = Input.getDouble();
        System.out.println("Area: " + Circle.getArea());
        System.out.println("Circumference: " + Circle.getCircumference());
    }
}
