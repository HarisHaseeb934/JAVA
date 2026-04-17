package Encapsulation;

public class Student {
    private String name;
    private int rollNumber;
    private double marks;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getRollNumber() {
        return rollNumber;
    }

    void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    double getMarks() {
        return marks;
    }

    void setMarks(double marks) {
        this.marks = marks;
    }
}
