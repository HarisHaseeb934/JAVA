package Encapsulation;

class Employee {
    private int id;
    private String name;
    private double salary;
    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    String getName(){
        return name;
    }
    int getId(){
        return id;
    }
    double getSalary(){
        return salary;
    }
    void raiseSalary(double percent){
        salary = salary + (salary * percent/100);
    }
    void display(){
        System.out.println("ID = " + id );
        System.out.println("Name = " + name);
        System.out.println("Salary = " + salary);
    }
}
