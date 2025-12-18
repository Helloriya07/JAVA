package FuncionalProgramming.FunctionDefault;

import java.util.Arrays;
import java.util.List;

public class MethodReferences {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("bob", "monty", "charlie");
        for(int i =0;i<names.size();i++){
            System.out.println(names.get(i));
        }
//         enhanced for loop
//        for(String s:name){
//            System.out.println(s);
//        }
//
//         consumer interface
//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String name) {
//                System.out.println(name);
//            }
//        });
//        or for each ke through
//        names.forEach((String name)->{
//            System.out.println(name);
//        });

        //or through this
//         names.forEach((name)->System.out.println(name));

        //using method refrences

        names.forEach(System.out::println);

    }
}
