package tr.com.testing;

public class CarTest {
    public static void main(String[] args){
//        Car defaultCar = new Car();
        Car toyota = new Car(150, 7, 45, "Toyota");

//        defaultCar.print();
//        toyota.print();

        toyota.drive(20);
        toyota.fuelCapacity = 100;

        toyota.refuel(10);
        toyota.refuel();
    }
}
