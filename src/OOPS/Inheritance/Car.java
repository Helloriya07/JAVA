package OOPS.Inheritance;

public class Car extends Vehicle{
    private int door;

    public Car( String brand , int speed) {
        super(brand,speed); // to call the constructor , private memeber acces.
    }
}
