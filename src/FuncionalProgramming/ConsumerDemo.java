package FuncionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("hello");
        consumer1.accept("Hoyeyeye");

        List<Integer> num = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> consumer =(n)-> System.out.print(n*2+" ");
        num.forEach(consumer);
        addconsumer.accept(4,6);

            }
            //biconsumer we can do chaining biconsumer -> consumer
    public static BiConsumer<Integer,Integer> addconsumer=
            (a, b)-> System.out.println("Addition="+(a+b));

}
