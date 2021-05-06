package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape1 = new Rectangle(5, 4);

        System.out.println("box1.getPerimeter() = " + myShape1.getPerimeter());
        System.out.println("box1.getArea() = " + myShape1.getArea());


        Measurable myShape2 = new Square(5);


        System.out.println("box2.getPerimeter() = " + myShape2.getPerimeter());
        System.out.println("box2.getArea() = " + myShape2.getArea());
    }
}
