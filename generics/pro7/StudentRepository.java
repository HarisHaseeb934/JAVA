package generics.pro7;

public class StudentRepository implements Repository<Student>{
    Student student;

    @Override
    public void save(Student item) {
        student = item;
    }

    @Override
    public Student get() {
        return student;
    }
}
