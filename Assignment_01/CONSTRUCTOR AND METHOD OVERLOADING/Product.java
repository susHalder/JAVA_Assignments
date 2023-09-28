class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    Product() {
        this.productId = 1;
        this.productName = "Laptop";
        this.price = 752200;
        this.quantity = 5;
    }

    Product(int id, String name, double pri, int quan) {
        this.productId = id;
        this.productName = name;
        this.price = pri;
        this.quantity = quan;
    }

    double totalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Product ID:" + productId);
        System.out.println("Product Name:" + productName);
        System.out.println("Price:" + price);
        System.out.println("Quantity:" + quantity);
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(2, "Mouse", 550, 3);
        System.out.println("___PRODUCT DETAILS___");
        p1.display();
        double totalcost1 = p1.totalCost();
        System.out.println("Total Cost=" + totalcost1);
        p2.display();
        double totalcost2 = p2.totalCost();
        System.out.println("Total Cost=" + totalcost2);

    }

}
