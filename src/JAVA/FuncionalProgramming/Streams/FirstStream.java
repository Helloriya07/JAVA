package FuncionalProgramming.Streams;

/*   Stream Pipelines.....

   SOURCE(Data fetched in streams)
        |
  INTERMEDIATE OPERATION(Series of operation results a new stream.)
  (performed only when terminal opertaion is executed.)
        |
  TERMINAL OPERATION(Collects the data from the stream result).

  Example--> List<Integer> evenNumber = numbers.stream()
                                        .filter(n->n%2==0)
                                        .collect(Collectors.toList());

 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FirstStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7,4,6,2,3,9);
        //ITERATION 1
        List<Integer> evenNumbers = new ArrayList<>();
        for(int even:numbers){
            if(even%2==0)
            evenNumbers.add(even);
        }
        System.out.println("Even numbers without streams" +evenNumbers);

        //ITERATION 2
        Stream<Integer> evenNumbers1 = numbers.stream();
        Stream<Integer> evenNumbers2 = evenNumbers1.filter(n->n%2==0);

        List<Integer> evenNumbers3= evenNumbers2.toList();
        System.out.println("even numbers using STREAMS="+evenNumbers3);

//     ITERATION 3
        List<Integer> evenlist = numbers.stream()
                .filter(n->n%2==0)
                        .toList();
               // .collect(Collectors.toList());
        System.out.println("evenlist ="+evenlist);
    }
}
