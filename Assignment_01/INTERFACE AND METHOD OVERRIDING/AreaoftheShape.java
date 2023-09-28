interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double width;
    double length;

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double calculateArea() {
        return width * length;
    }
}

public class AreaoftheShape {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        Rectangle rec = new Rectangle(5.0, 2.0);
        System.out.println("Area of the Circle:" + c.calculateArea());
        System.out.println("Area of the Rectangle:" + rec.calculateArea());
    }
}
