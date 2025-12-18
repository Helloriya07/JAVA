package OOPS;


public class ClasesObject {
    public static void main(String[] args) {
        Car car1 = new Car("toyota","red",100);
//        car1.brand = "toyota";
//        car1.speed=100;
//        car1.colour="blue";
     car1.drive();

        Car car2 = new Car("maruti","white",49);
//        car2.brand = "mahindra";
//        car2.speed=50;
//        car2.colour="white";
       car2.drive();

        System.out.println(car2.getSpeed());

    }


}
