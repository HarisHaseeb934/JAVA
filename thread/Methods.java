package thread;

// start() : start the execution of the thread.
// run() : used to do an action for a thread.
// sleep() : sleeps a thread for the specified amount of time.
// join() : It waits for a thread to die.
// currentThread() : returns a reference to the currently executing thread object.
// getPriority() : It returns the priority of the thread.
// setPriority() : It changes the priority of the thread.
// getName() : It returns the name of the thread.
// setName() : It changes the name of the thread.
// interrupt() : It interrupts the thread.
// yield() :  thread object to pause and allow other threads to execute temporarily.
// setDaemon() :  It marks the thread as a daemon or a user thread.

public class Methods extends Thread{
    Methods(String name){
        super(name);
    }
    public void run() {

        while(true){
            System.out.println("Running......");
        }
//        for(int i = 0; i < 5; i++){
//            System.out.println(Thread.currentThread().getName() + " Priority : " + Thread.currentThread().getPriority());
//            try{
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//        }
    }

    public static void main(String args[]) {
        Methods h = new Methods("High");
//        Methods m = new Methods("Medium");
//        Methods l = new Methods("Low");
//        h.setPriority(Thread.MAX_PRIORITY);
//        m.setPriority(Thread.NORM_PRIORITY);
//        l.setPriority(Thread.MIN_PRIORITY);

        h.setDaemon(true);
        h.start();
//        h.interrupt();

//        m.start();
//        l.start();


    }
}
