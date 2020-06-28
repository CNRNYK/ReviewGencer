package tr.com.testing;

public class Car {
    int topSpeed = 200;
    int totalSeats = 5;
    int fuelCapacity = 50;
    public int currentFuelAmount = this.fuelCapacity;
    protected String manufacturer = "Temsa";

    public Car() {
        System.out.println(this.manufacturer + " arabasi olusturuldu.");
        this.refuel();
    }

    public Car(int topSpeed, int totalSeats, int fuelCapacity, String manufacturer) {
        this.topSpeed = topSpeed;
        this.totalSeats = totalSeats;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelAmount = this.fuelCapacity;
        this.manufacturer = manufacturer;
        System.out.println(this.manufacturer + " arabasi olusturuldu.");
        this.refuel();

    }

    public void refuel(){
//        for (int i = 0; i < 10; i++) {
//            public int amount = 10;
//        }
        this.currentFuelAmount = this.fuelCapacity;
        System.out.println(this.manufacturer + " arabasi fullendi." + " Toplam yakıt miktarı: " + this.currentFuelAmount);
    }

    public void refuel(int fuelAmount){
        this.currentFuelAmount += fuelAmount;
        System.out.println(this.manufacturer + " arabasina yakit alindi." + " Toplam yakıt miktarı: " + this.currentFuelAmount);
    }


    public void park(){

    }

    public void drive(int distance){
        this.currentFuelAmount -=  distance * 1;
        System.out.println(this.manufacturer + " arabasi " +  distance + " kadar yol katetti ve mevcut kalan yakit: " + this.currentFuelAmount);
    }

    public void print(){
        System.out.println("Manufacturer: " + this.manufacturer + ", Total Seats:" + this.totalSeats + ", Fuel Capacity" +
                this.fuelCapacity + ", Top Spead:" + this.topSpeed);
    }
}
