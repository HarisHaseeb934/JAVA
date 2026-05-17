package lock;
class SharedData{
    int data;
    boolean hasData;

    synchronized void produce(int value){
        while(hasData){
            try{
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produce " + value);
        notify();
    }
    synchronized int consume(){
        while(!hasData){
            try{
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println("Consume " + data);
        notify();
        return data;
    }
}

class Produce implements Runnable{
    SharedData resource;
    Produce(SharedData resource){
        this.resource = resource;
    }
    public void run(){
        for (int i = 0; i < 10; i++){
            resource.produce(i);
        }
    }
}
class Consume implements Runnable{
    SharedData resource;
    Consume(SharedData resource){
        this.resource = resource;
    }
    public void run(){
        for (int i = 0; i < 10; i++){
            int value = resource.consume();
        }
    }
}
public class ThreasCommunication {
    public static void main(String[] args) {
        SharedData resource = new SharedData();
        Thread t1 = new Thread(new Produce(resource));
        Thread t2 = new Thread(new Consume(resource));
        t1.start();
        t2.start();
    }
}