package collection.set.treeset;

public class Student implements Comparable<Student>{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student that) {
        if(that.id - this.id < 0){
            return -1;
        }else if(that.id - this.id > 0){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Id : " + id + " , Name : " + name;
    }
}
