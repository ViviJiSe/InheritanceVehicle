public class Car extends Vehicle{

    protected boolean fourByFour;
    protected int numberOfDoors;

    public Car(String brand, int model, String color, String fuel, int wheels, boolean automatic, boolean fourByFour, int numberOfDoors) {
        super(brand, model, color, fuel, wheels, automatic);
        this.fourByFour = fourByFour;
        this.numberOfDoors = numberOfDoors;
    }
}
