
interface FuelConsumer {
    void calculateFuelEfficiency(double distance, double fuelUsed);
}

class Vehicle {
    String brand;
    String model;

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void showVehicleInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

class Car extends Vehicle implements FuelConsumer {
    int seatingCapacity;


    Car(String brand, String model, int seatingCapacity) {
        super(brand, model);
        this.seatingCapacity = seatingCapacity;
    }

   
  
    public void calculateFuelEfficiency(double distance, double fuelUsed) {
        if (fuelUsed <= 0) {
            System.out.println("Fuel used must be greater than zero.");
            return;
        }
        double efficiency = distance / fuelUsed;
        System.out.println("Fuel Efficiency: " + efficiency + " km/l");
    }

    void showCarDetails() {
        showVehicleInfo(); 
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}


public class completeinheri {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 5);
        myCar.showCarDetails();
        myCar.calculateFuelEfficiency(500.0, 25.0);
    }
}