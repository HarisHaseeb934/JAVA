package Basics;

class PrimeCheck {
    static boolean isPrime(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 13;
        if(isPrime(num)){
            System.out.println(num + " is Prime");
        }else{
            System.out.println(num + " is not Prime");
        }
    }
}
