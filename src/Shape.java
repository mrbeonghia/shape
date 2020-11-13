class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("blue", true, 3);
        System.out.println(circle);
    }
}

public class Shape {
    String color;
    boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
        color = "green";
        filled = true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        String f;
        if (filled) {
            f = "filled";
        } else {
            f = "not filled";
        }
        return "A Shape with color of " + color + " and " + f;
    }
}

class Circle extends Shape {
    double radius = 1.0;

    public Circle() {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + radius + ", which is a subclass of " + super.toString();
    }
}

class Rectangle extends Shape {
    double width = 1.0;
    double length = 1.0;

    public Rectangle(){}

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "A Rectangle with = "+width+" and length = "+length+" which is subclass of "+super.toString();
    }
}

class Square extends Rectangle{

    public Square(){}

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width){
        setSide(width);
    }
    public void setLength(double length){
        setSide(length);
    }

}
