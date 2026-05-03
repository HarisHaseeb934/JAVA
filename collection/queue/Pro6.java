package collection.queue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Pro6 {
    static void main(String[] args) {
        PriorityQueue<Job> jobs = new PriorityQueue<>((a , b)-> a.getPriority() - b.getPriority());
        jobs.add(new Job(1,1));
        jobs.add(new Job(2,5));
        jobs.add(new Job(3,8));
        jobs.add(new Job(4,6));

        while(!jobs.isEmpty()){
            System.out.println(jobs.poll());
        }
    }
}

class Job{
    int id;
    int priority;

    public Job(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Id : " + id + " , Priority : " + priority;
    }
}
