class Employee {
    String name, designation;
    int employeeid;
    double salary;

    Employee() {
        this.name = "Soma";
        this.employeeid = 101;
        this.salary = 200000;
        this.designation = "director";
    }

    Employee(String n, int i, double sal, String desig) {
        this.name = n;
        this.employeeid = i;
        this.salary = sal;
        this.designation = desig;
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Id:" + employeeid);
        System.out.println("Salary:" + salary);
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e = new Employee("UTTAM", 102, 500000, "CEO");
        System.out.println("___Employee Details___");
        e1.display();
        e.display();

    }
}
