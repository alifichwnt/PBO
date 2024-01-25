public class Square extends Rectangle {
    double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getside() {
        return this.side;
    }

    public void setside(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public String toString() {
        return "Square[Shape[color=" + getColor() + ", Filled=" + isFilled() + "],side=" + side + "]";
    }

}