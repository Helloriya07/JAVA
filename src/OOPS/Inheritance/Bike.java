package OOPS.Inheritance;

public class Bike extends Vehicle{
  public boolean hascarrier;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand="+getBrand()+"Speed="+getSpeed()+"hascarrier "+hascarrier);
    }

    public Bike(String brand, int speed, boolean hascarrier) {
        super(brand, speed);
        this.hascarrier = hascarrier;

    }
}
