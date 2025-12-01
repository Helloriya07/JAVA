package FuncionalProgramming.Streams.BookListing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

 /*
        - Discounted Books: The bookstore is planning a sale.
            Identify all books that are priced over $20. Display these books.
        - Classics Collection: The bookstore is launching a classics collection.
            Identify and display books that were published before the year 2000.
        - Upcoming Titles: Generate a list of future book titles for the next year
            by adding the suffix "(Coming Soon)" to all the current titles.
        - Sort by Price: The bookstore wants to print price tags for all the books.
            Display the books sorted by their prices in ascending order.
        - Rare Books: The bookstore believes there might be rare books in the
            collection. A rare book is one where the title has more than 20
            characters. Identify and display these books.
         */

public class BookStoreChallange {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(

                new Book("Fiction", 399.0, 2018, "The Silent Ocean"),
                new Book("Programming", 799.0, 2021, "Java Mastery"),
                new Book("Self-Help", 299.0, 2015, "Atomic Habits Guide"),
                new Book("Science", 499.0, 2020, "Quantum Reality"),

                new Book("Animi", 269.0, 2018, "Hesh Shadows"),
                new Book("Fiction", 259.0, 2012, "Moonlight Shadows"),
                new Book("Fiction", 259.0, 2012, "Moonlight Shadows"),
                new Book("Science", 25.99, 2015, "Quantum Realm"),
                new Book("Technology", 40.00, 2023, "Advanced Spring Boot"),
                new Book("Biography", 16.99, 2019, "The Innovator's Journey"),
                new Book("Fiction", 9.99, 1998, "Old Man and the Sea"),
                new Book("Fiction", 789.99, 2026, ""),
                new Book("Fiction", 999.99, 2027, "")

        );
        //Identify b0oks that are priced above $20
        Stream<Book> booklist = books.stream()
                .filter(book -> book.price > 20);
        booklist.forEach(System.out::println);

        System.out.println("Add suffix \"(Coming Soon)\" to all the current titles");
        books.stream()
                .filter(book -> book.publishedyear>2025)
                .map(book -> book.title + " (Coming Soon)")
                .forEach(System.out::println);

        //sort book price in acsneding order
        System.out.println("SORTING IN ASCENDING ORDER");
        Stream<Book> sortedStream = books.stream()
                .sorted(Comparator.comparing(book -> book.price));
        sortedStream.forEach(System.out::println);

        // A rare book is one where the title has more than 20
        //            characters.
        System.out.println("A rare book is one where the title has more than 20\n" + " characters.");
        books.stream()
                .filter(book -> book.title.length() > 20)
                .forEach(System.out::println);

    }
}