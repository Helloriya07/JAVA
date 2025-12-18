package OOPS.Encaps;



        class Care {

            String brand;
            String colour;
            private int speed;

            public Care(String brand, String colour, int speed) {
//    System.out.println("constructor called");
                this.brand = brand;
                this.colour = colour;
                this.speed = speed;


            }

            public void drive() {
                System.out.println(brand + " " + "is driving with speed " + speed + "and colour is " + colour);
            }

            public int getSpeed() {
                return speed;
            }

            public void setSpeed(int speed) {
                this.speed = speed;
            }


        }

public class Encapsulation {
    public static void main(String[] args) {
        Care car3 = new Care("bmw", "red", 77);
        car3.setSpeed(-89);
        car3.drive();

    }
}