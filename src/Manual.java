public class Manual extends Car{

    public Manual(String brand, int model, String color, String fuel, int wheels, boolean automatic, boolean fourByFour, int numberOfDoors) {
        super(brand, model, color, fuel, wheels, automatic, fourByFour, numberOfDoors);
    }

    public void clutch(){

    }

    @Override
    public String toString() {
        return "Manual{" +
                "fourByFour=" + fourByFour +
                ", numberOfDoors=" + numberOfDoors +
                ", brand='" + brand + '\'' +
                ", model=" + model +
                ", color='" + color + '\'' +
                ", fuel='" + fuel + '\'' +
                ", wheels=" + wheels +
                ", automatic=" + automatic +
                '}';
    }
}
