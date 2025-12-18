package OOPS;

record Bike(String brand,int speed){}

public class Record {
    public static void main(String[] args) {
        Bike b = new Bike("bmw",90);
        System.out.println("brand = "+b.brand());
        System.out.println("brand = "+b.speed());
        System.out.println(b); //tostring
    }

}
