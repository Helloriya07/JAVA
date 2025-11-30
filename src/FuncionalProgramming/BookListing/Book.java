package FuncionalProgramming.BookListing;

public class Book {
    String category;
    double price;
    int publishedyear;
    String title;

    public Book(String category,double price, int publishedyear,String title){
        this.category=category;
        this.price = price;
        this.publishedyear = publishedyear;
        this.title=title;
    }


    @Override
    public String toString() {
        return "Book{" +
                "category='" + category + '\'' +
                ", price=" + price +
                ", publishedyear=" + publishedyear +
                ", title='" + title + '\'' +
                '}';
    }
}
