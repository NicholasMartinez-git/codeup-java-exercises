package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        boolean another;
        do {
            System.out.println("Please enter a radius: ");
            double radius = Input.getDouble();
            Circle myCircle = new Circle(radius);
            System.out.println("Radius: " + radius);
            System.out.println("Area: " + myCircle.getArea());
            System.out.println("Circumference: " + myCircle.getCircumference());
            another = Input.yesNo();
        } while (another);
    }
}
