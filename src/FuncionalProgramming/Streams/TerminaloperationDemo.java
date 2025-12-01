package FuncionalProgramming.Streams;

import FuncionalProgramming.Streams.BookListing.IntermediateDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminaloperationDemo {
    public static void main(String[] args) {


        //reduce
        List<Integer> integerList = Arrays.asList(1,2,3);
        Stream<Integer> intstream = integerList.stream();
        int mul = intstream.reduce(1,(acc,num)->acc*num);
        System.out.println(+mul);
//Shorhand
int total = integerList.stream()
        .reduce(1,(acc,num)->acc*num);
        System.out.println(total);

        //collect
        List<Integer> integerList1 = Arrays.asList(8,6,7,9,4,55,89,10);
        Set<Integer> numbers = integerList1.stream()
                              .filter(n->n>8)
                .collect(Collectors.toSet());
        System.out.println(numbers);

        //find & match
        System.out.println(numbers.stream().findFirst().get());
        System.out.println(numbers.stream().findAny().get());

      boolean has10=  numbers.stream()
//              .anyMatch(n->n==10);
//        .allMatch((n->n<100));
        .noneMatch((n->n<100));
        System.out.println(has10);

        //iteration
numbers.stream()
        .forEach(System.out::print);
    }
}