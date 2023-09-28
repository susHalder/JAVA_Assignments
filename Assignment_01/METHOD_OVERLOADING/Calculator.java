class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    void displayResult(int result) {
        System.out.println("Result: " + result);
    }

    void display(double result) {
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int intResult1 = cal.add(5, 10);
        double doubleResult1 = cal.add(5.0, 3.0);
        double mixedResult1 = cal.add(5, 11.0);

        cal.display(intResult1);
        cal.display(doubleResult1);
        cal.display(mixedResult1);
    }
}
