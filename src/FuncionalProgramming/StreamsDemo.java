package FuncionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("fruits","apple","Banana");
        for(String fruit : items){
            System.out.println(fruit);
        }
        // using streams
        Stream<String> stream = items.stream();
        stream.forEach(System.out::println);

        System.out.println("==Filterd stream==");
//        Stream<String> stream2 = items.stream();
//
//       Stream<String> filterstream =
//               stream2.filter(name->name.startsWith("B"));
//       filterstream.forEach(System.out::println);

        System.out.println("==More concise code==");
         items.stream() //stream created
                .filter(name->name.startsWith("B")) //filterd
                 .forEach(System.out::println); //print

        /* USE CASES OF STREAMS
        1) Filtering
        2)Mapping
        3)Aggregation
        4)Searching
        5)Iteration
         */
    }

}
