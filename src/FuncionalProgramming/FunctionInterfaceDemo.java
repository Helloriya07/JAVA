package FuncionalProgramming;

import java.util.function.Function;
//Represents a function that accepts one argument and produces a result.

public class FunctionInterfaceDemo {
    public static Function<Integer,Integer> addfunction=(a)-> a+3;

//    Type parameters:
//<T> – the type of the input to the function
//<R> – the type of the result of the function

    public static Function<Integer,Integer> subfunction=(a)-> a-5;

    //channing
    public static Function<Integer,Integer> combinedfunction= addfunction.andThen(subfunction);

    public static void main(String[] args) {
        System.out.println(addfunction.apply(100));
        System.out.println(subfunction.apply(100));
        System.out.println(combinedfunction.apply(5));

    }
}
