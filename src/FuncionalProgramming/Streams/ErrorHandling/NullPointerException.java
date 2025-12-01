package FuncionalProgramming.Streams.ErrorHandling;

import java.util.Optional;

public class NullPointerException {
    public static void main(String[] args) {
        String name =null;
        if(name!=null) {
            System.out.println(name.length());
        }
            else{
            System.out.println("No name");
        }



            //Optional creation
        Optional<String> optionalString = Optional.of("some value");
        Optional<String> empty = Optional.empty();
        Optional<String> mayBe = Optional.ofNullable(null);

        //checking values...
        System.out.println(optionalString.isPresent()); // yes present true
        System.out.println(empty.isPresent()); //empty false
        System.out.println(empty.isEmpty()); // empty true

        System.out.println(mayBe.isPresent()); //null false

        System.out.println(mayBe.isEmpty()); //null true

        //Retrieving values using get()
        System.out.println(optionalString.get());
//        System.out.println(empty.get());
//        System.out.println(mayBe.get());

        //safe retrieval of values in optional
        //orElse()
        System.out.println(optionalString.orElse("default"));
        System.out.println(mayBe.orElse("orelsevalue"));

        //orElseGet
        String result = optionalString.orElseGet(()->{
//        String result = mayBe.orElseGet(()->{
            System.out.println("orelseget");
            return "default if empty or null";
        });
        System.out.println(result);

//orElseThrow
        String newRes = mayBe.orElseThrow(
                ()->  new RuntimeException("value not found")
                );
        System.out.println(newRes);



    }
}
