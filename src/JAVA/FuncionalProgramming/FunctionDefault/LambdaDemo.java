package FuncionalProgramming.FunctionDefault;

@FunctionalInterface
interface BookAction{
    void perform();
}

@FunctionalInterface
interface Operation{
    int add(int a,int b);
}
@FunctionalInterface
interface Runnable{
    void thread();
}
public class LambdaDemo {
    public static void main(String[] args) {


        //step 1
        BookAction action = new BookAction() {
            @Override
            public void perform() {
                System.out.println("Action performed");
//                action.perform();
            }
        };

        // Step 2
        BookAction action1 = () -> {
            System.out.println("Action performed");
//                action1.perform();
        };
        //Step 3 reduces boilerplate code to give defination of functional interface = Lambda expression
        BookAction action2 = () ->
                System.out.println("Action performed");
        action2.perform();


        //functional interface with parameter
        Operation op = (int a, int b) -> {
            return a + b;

        };
        System.out.println(op.add(10, 20));
        Runnable run =()-> System.out.println("new thread");
        run.thread();

    }
}

