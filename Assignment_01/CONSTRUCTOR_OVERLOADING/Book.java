class Book {
    String title, author;
    int price;
    double isbn;

    Book() {
        this.title = "C";
        this.author = "Dennis_Ritchie";
        this.price = 550;
        this.isbn = 98571220;
    }

    Book(String ti, String au, int pri, double is) {
        this.title = ti;
        this.author = au;
        this.price = pri;
        this.isbn = is;
    }

    void display() {

        System.out.println("Book Name:" + title);
        System.out.println("Author Name:" + author);
        System.out.println("Price:" + price);
        System.out.println("ISBN number:" + isbn);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java", "Bill_Joy", 650, 3675089);
        System.out.println("___Book Information___");
        b1.display();
        b2.display();
    }
}
