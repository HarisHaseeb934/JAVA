package Enum;

enum CoffeeSize {
    SMALL(150), MEDIUM(250), LARGE(350);
    private final int price;
    CoffeeSize(int p){
        this.price = p;
    }
    void getPrice(){
        System.out.println(price);
    }
    void thank(){
        System.out.println("Your bill is : " + price);
    }
}
