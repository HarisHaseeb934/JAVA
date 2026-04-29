package functionAndLambda;

import java.util.function.Supplier;

public class SupplierExample {
    static void main(String[] args) {
        Supplier<Student> stuCreate = () -> {
            Student x = new Student(101, "Haris");
            return x;
        };
        System.out.println(stuCreate.get());

        Supplier<Double> randomGen = () -> Math.random();
        System.out.println(randomGen.get());
    }
}
class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}