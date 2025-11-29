package FuncionalProgramming;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class RealUsage {
    public static BiFunction<String,Double,String> item=(title,price)-> title+"cost = $"+price;


    public static BiConsumer<String,Double> item1=(title, price)-> System.out.println(title+"cost = $"+price);

    public static void main(String[] args) {
        System.out.println(item.apply("Harrypotter",466.89));
        System.out.println(item.apply("the phenix club",599.89));
        System.out.println(item.apply("cottage",456.97));
        System.out.println(item.apply("Limits and low",346.89));
        System.out.println(item.apply("Cause an death",679.89));

        System.out.println("****************************");

        item1.accept("Harrypotter",466.89);
        item1.accept("the phenix club",599.89);
        item1.accept("cottage",456.97);
        item1.accept("Limits and low",346.89);
        item1.accept("Cause an death",679.89);

        //Behavioral analysis...
        Predicate<Double> isExpensive =price-> price>500;
        System.out.println(isExpensive.test(766.68));
        System.out.println(isExpensive.test(389.76));
    }
}
