package FuncionalProgramming.Streams;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
From Collection: e.g-> collection.stream().
From Arrays e.g. Arrays.stream(array);
From Specific values e.g Stream.of("a","b","c").
From Functions e.g Stream.iterate(0,n->n+2).
From Files: e.g Files.lines(path)
Empty Stream e.g. Stream.empty();
 */
public class DifferentStreamsDemo {
    public static void main(String[] args) throws IOException {


//    From Collection: e.g-> collection.stream().
        List<Integer> coco = Arrays.asList(1,3,5,7);
        Stream<Integer> s1 = coco.stream();
        s1.forEach(System.out::println);

        //From Array
        int[] numberArray ={17,995,678,44469,9874,236};
        IntStream arraystream = Arrays.stream(numberArray);
        arraystream.forEach(System.out::println);

        //From Specific values
        Stream<String> stringstream = Stream.of("a","b","c");
       stringstream.forEach(System.out::println);

       //FROM FUNCTION
        Stream<Integer> integerStream=Stream.iterate(0,n->n+2);
//        integerStream.forEach(System.out::println);

        // FROM FILES
//        Stream<String> filesstream = Files.lines(Path.of("PAth"));

        //Empty Stream
        Stream<String> emptystream = Stream.empty();
    }
}
