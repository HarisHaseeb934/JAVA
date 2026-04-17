package Encapsulation;

public class Main {
    public static void main(String[] args) {
        // Book Class
//        Book book1 = new Book();
//        book1.title = "Game of Throne";
//        book1.author = "George RR Martin";
//        book1.price = 1300;
//
//        System.out.println(book1.title);
//        System.out.println(book1.author);
//        System.out.println(book1.price);

        // Book Class
//        Book book2 = new Book("A Storm of Swords", "George RR Martin", 1500 );
//
//        System.out.println(book2.title);
//        System.out.println(book2.author);
//        System.out.println(book2.price);

        // Rectangle Class
//        Rectangle rectangle = new Rectangle(12,8);
//        rectangle.displayArea();

        // Student Class
//        Student student1 = new Student();
//
//        student1.setName("Haris");
//        student1.setRollNumber(1);
//        student1.setMarks(96);
//
//        System.out.println("Name = " + student1.getName());
//        System.out.println("Roll Number = " + student1.getRollNumber());
//        System.out.println("Marks = " + student1.getMarks());

        // Cirlce Class
//        Circle circle = new Circle(2.65);
//        System.out.println(circle.calculateArea());
//        System.out.println(circle.calculateCircumference());

        // BankAccount Class
//        BankAccount account1 = new BankAccount();
//        account1.accountNumber = 1;
//        account1.accountHolder = "Haris";
//
//        account1.deposit(1000);
//        System.out.println(account1.withDraw(100));
//        account1.displayBalance();

        // Employee Class
//        Employee employee = new Employee(01, "Haris", 500000);
//        employee.display();
//        employee.raiseSalary(15);
//        employee.display();
//
//        Employee employee2 = new Employee(02, "Faraz", 500000);
//        employee2.display();
//        employee2.raiseSalary(20);
//        employee2.display();

        // Constructor Students Class
        ConstructorStudents student1 = new ConstructorStudents();
        student1.display();

        ConstructorStudents student2 = new ConstructorStudents("Haris");
        student2.display();

        ConstructorStudents student3 = new ConstructorStudents("Soban", 3, 96);
        student3.display();
    }
}
