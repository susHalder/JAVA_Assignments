public class Vehicle {
    String make;
    String model;
    int year;
    double price;

    Vehicle() {
        this.make = "Toyota";
        this.model = "Camry";
        this.year = 2022;
        this.price = 50000;
    }

    Vehicle(String ma, String mo, int ye, double pri) {
        this.make = ma;
        this.model = mo;
        this.year = ye;
        this.price = pri;
    }

    void display() {
        System.out.println("Make:" + make);
        System.out.println("Model:" + model);
        System.out.println("Year:" + year);
        System.out.println("Price:" + price);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("Honda", "Civic", 2020, 700000);
        System.out.println("___VEHICLE DETAILS___");
        System.out.println("Vehicle_1 Details:");
        v1.display();
        System.out.println("Vehicle_2 Details:");
        v2.display();

    }
}
