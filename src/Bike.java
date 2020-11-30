public class Bike extends Vehicle {

    protected boolean electricStart;

    public Bike(String brand, int model, String color, String fuel, int wheels, boolean automatic, boolean electricStart) {
        super(brand, model, color, fuel, wheels, automatic);
        this.electricStart = electricStart;
    }
}
