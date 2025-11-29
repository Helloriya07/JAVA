package FuncionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BifunctionDemo {
    public static BiFunction<Integer,Integer,Integer>addfunction =
//            (a,b) -> a+b;
Integer::sum;
    public static BiFunction<Integer,Integer,Integer>subfunction = (a,b) -> a-b;


    public static Function<Integer , Integer> multiply=(a)->a*4;
//channing
public static BiFunction<Integer,Integer,Integer> combinedfunction = addfunction.andThen(multiply);

//public static BiFunction<Integer,Integer,Integer> combinedfunction2 = addfunction.andThen(subfunction);


    public static void main(String[] args) {

        System.out.println(addfunction.apply(3,6));
        System.out.println(subfunction.apply(3,6));
        System.out.println(combinedfunction.apply(1,3));



    }
}
