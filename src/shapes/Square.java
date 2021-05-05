package shapes;

public class Square extends Rectangle {
    private double side;

    public Square(double side) {
        super(side, side); // we use "side" as 2 parameters because rectangle method needs a length and width
        this.side = side; // this allows to override getArea/getPerimeter in Rectangle
    }

    public double getArea() {
        System.out.println("Override");
        return Math.pow(side, 2);
    }

    public double getPerimeter() {
        System.out.println("Override");
        return 4 * side;
    }

    public static void main(String[] args) {

    }
}
