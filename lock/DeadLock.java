package lock;

class Pen {
    synchronized void writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName() + " Waiting for Paper");
        paper.usePaper();
    }
    synchronized void usePen(){
        System.out.println(Thread.currentThread().getName() +  " Using Pen");
    }
}
class Paper {
    synchronized void writeWithPaperAndPen(Pen pen){
        System.out.println(Thread.currentThread().getName() + "Waiting for Pen");
        pen.usePen();
    }
    synchronized void usePaper() {
        System.out.println(Thread.currentThread().getName()
                + " using PAPER");
    }
}
public class DeadLock {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Runnable waitPaper = new Runnable() {
            @Override
            public void run() {
                pen.writeWithPenAndPaper(paper);
            }
        };
        Runnable waitPen = new Runnable() {
            @Override
            public void run() {
                    paper.writeWithPaperAndPen(pen);
            }
        };

        Thread t1 = new Thread(waitPaper,"Thread 1");
        Thread t2 = new Thread(waitPen,"Thread 2");

        t1.start();
        t2.start();
    }
}
