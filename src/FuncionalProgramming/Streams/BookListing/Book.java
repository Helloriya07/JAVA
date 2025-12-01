package FuncionalProgramming.Streams.BookListing;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPublishedyear() {
        return publishedyear;
    }

    public void setPublishedyear(int publishedyear) {
        this.publishedyear = publishedyear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
