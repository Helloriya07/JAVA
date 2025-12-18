package FuncionalProgramming.Streams.ErrorHandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ErrorHandlingDemo {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Bombay", "delhi", "Nasik");
        cities.stream()
                .forEach(b->{
                    try{
                        if(b.equals("delhi")){
                            throw new RuntimeException("Invalid cities");
                        }
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                });
    }
}
