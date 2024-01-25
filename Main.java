public class Main extends Shape {
    public static void main(String[] args) {
        // Create objects of Shape, Circle, Rectangle, and Square
        Shape shape = new Shape("blue", false);
        Circle circle = new Circle(5.0, "green", true);
        Rectangle rectangle = new Rectangle(3.0, 4.0, "yellow", true);
        Square square = new Square(2.0, "red", false);
        Shape shape1 = new Shape();
        Circle circle1 = new Circle();
        Rectangle rectangle1 = new Rectangle();
        Square square1 = new Square();

        // Display information using toString method
        System.out.println("Before Input");
        System.out.println("Shape: " + shape1.toString());
        System.out.println("Circle: " + circle1.toString());
        System.out.println("Rectangle: " + rectangle1.toString());
        System.out.println("Square: " + square1.toString());
        System.out.println(" ");
        System.out.println("After Input ");
        System.out.println("Shape: " + shape.toString());
        System.out.println("Circle: " + circle.toString());
        System.out.println("Rectangle: " + rectangle.toString());
        System.out.println("Square: " + square.toString());
        System.out.println(" ");
        // Demonstrate calling methods
        System.out.println("Before Input");
        System.out.println("Circle Area: " + circle1.getArea());
        System.out.println("Circle Perimeter: " + circle1.getPerimeter());
        System.out.println("Rectangle Area: " + rectangle1.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle1.getPerimeter());
        System.out.println("Square Area: " + square1.getArea());
        System.out.println("Square Perimeter: " + square1.getPerimeter());

        System.out.println(" ");
        System.out.println("After Input ");
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
    }

}
