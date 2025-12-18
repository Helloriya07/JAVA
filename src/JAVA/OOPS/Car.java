package OOPS;

 public class Car {

    public int getSpeed(int speed)
    {
        if(speed<0) {
            return 0;
        }
        return speed;

    }

String brand;
String colour;
int speed;

public Car(String brand, String colour, int speed){
//    System.out.println("constructor called");
    this.brand = brand;
    this.colour=colour;
    this.speed=speed;



}
public void drive(){
    System.out.println(brand+" "+"is driving with speed "+speed+"and colour is "+colour);

}

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
