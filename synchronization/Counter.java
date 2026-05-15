package synchronization;

public class Counter {
    private int count;
    // if synchronized did not attach , Condition is called race around
    // if synchronized is attach , Condition is called critical condition
    synchronized void increment(){
        count++;
    }
    int getCount(){
        return count;
    }
}
