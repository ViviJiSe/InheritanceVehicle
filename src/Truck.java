public class Truck extends Vehicle{

    protected boolean emergencyTruck;

    public Truck(String brand, int model, String color, String fuel, int wheels, boolean automatic, boolean emergencyTruck) {
        super(brand, model, color, fuel, wheels, automatic);
        this.emergencyTruck = emergencyTruck;
    }
}
