package Encapsulation;

class ConstructorStudents {
    String name;
    int rollNumber;
    double marks;
    ConstructorStudents(){
        this.name = "Default";
        this.rollNumber = 0;
        this.marks = 0.0;
    }
    ConstructorStudents(String name){
        this.name = name;
    }
    ConstructorStudents(String name, int rollNumber, double marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    void display(){
        System.out.println("Name = " + name);
        System.out.println("Roll Number = " + rollNumber);
        System.out.println("Marks = " + marks);
    }
}
