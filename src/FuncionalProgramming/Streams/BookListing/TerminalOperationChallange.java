package FuncionalProgramming.Streams.BookListing;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationChallange {
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
        //Total cost of book
        Double bookcost = books.stream()
                .mapToDouble(book -> book.price)
                .reduce(0, (acc, price) -> acc + price);
        System.out.println(bookcost);


        //Collecting book into a list of titles
        List<String> booktitle = books.stream()
                .map(book -> book.title).toList();
        System.out.println(booktitle);

        //Grouping book by category
        System.out.println("****************************************");
        Map<String, List<Book>> byCategory=books.stream()
                .collect(Collectors.groupingBy(bookStringFunction));
        byCategory.forEach((category, bookList) -> {
            bookList.forEach(System.out::println);

        });
    }


    static Function<Book,String> bookStringFunction = new Function<Book,String>(){
        public String apply(Book book){
            return book.getCategory();
        }
    };
}
