package InnerClasses.local;

public class Bank {
    double rate;

    Bank(double rate){
        this.rate = rate;
    }

    void calculateInterest(int args){
        int principle = args;

        class Interest{
            void show(){
                System.out.println("Rate : " + rate);
                System.out.println("Principle : " + principle);
            }
        }

        Interest interest = new Interest();
        interest.show();

        rate = 0.6;
//        principle = 5;
    }
}
