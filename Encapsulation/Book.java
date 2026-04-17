package Encapsulation;

class Book {
    String title;
    String author;
    double price;
    Book(){
        title = "Game of Thrones";
        author = "George RR Martin";
        price = 1300;
    }
    Book(String newTitle, String newAuthor, double newPrice){
        title = newTitle;
        author = newAuthor;
        price = newPrice;
    }
}
