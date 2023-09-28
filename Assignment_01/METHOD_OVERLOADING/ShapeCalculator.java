class ShapeCalculator {
    // area of the rectangle
    double calculateArea(double length, double width) {
        return length * width;
    }

    // area of the circle
    double calculateArea(double r) {
        return Math.PI * r * r;
    }

    // area of the triangle
    float calculateArea(float base, float height) {
        return (base * height) / 2;
    }

    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();
        double calrectangle = calculator.calculateArea(5.0, 10.0);
        System.out.println("Area of the Rectangle:" + calrectangle);
        double calcircle = calculator.calculateArea(5.2);
        System.out.println("Area of the Circle:" + calcircle);
        float caltriangle = calculator.calculateArea(6, 10);
        System.out.println("Area of the Triangle:" + caltriangle);
    }
}
