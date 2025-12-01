package FuncionalProgramming.Streams.BookListing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateDemo {
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
                new Book("Fiction", 9.99, 1998, "Old Man and the Sea")
    );
        // 1. Filtering: Books cheaper than $20
        Stream<Book> filteredBooks = books.stream()
                .filter(book -> book.price < 20);
        filteredBooks.forEach(System.out::println);

        // 2. Mapping: Convert book titles to uppercase
        Stream<String> booktitles = books.stream()
                .map(book-> book.title.toUpperCase());
                booktitles.forEach(System.out::println);


//        // 3. Sorting: Books by publication date
        Stream<Book> sortedbook=books.stream()
                .sorted(Comparator.comparing(book->book.publishedyear));
        sortedbook.forEach(System.out::println);


        // 4. Limit: Display only the first 3 books
        Stream<Book> firstThree = books.stream()
                .sorted(Comparator.comparing(book->book.publishedyear))
                .limit(3);
        firstThree.forEach(System.out::println);


//        // 5. Skip: Skip the first 2 books
//        Stream<Book> skipbook = books.stream()
//                .skip(2);
//        skipbook.forEach(System.out::println);
//
//        //        // 4. Distinct: Remove duplicate titles
////        Stream<Book> uniquebooks = books.stream().distinct();
////                uniquebooks.forEach(System.out::println);






    }
    }

