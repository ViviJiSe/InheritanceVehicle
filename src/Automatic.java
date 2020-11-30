public class Automatic extends Car{

    protected String typeOfTransmission;

    public Automatic(String brand, int model, String color, String fuel, int wheels, boolean automatic, boolean fourByFour, int numberOfDoors, String typeOfTransmission) {
        super(brand, model, color, fuel, wheels, automatic, fourByFour, numberOfDoors);
        this.typeOfTransmission = typeOfTransmission;
    }

    @Override
    public String toString() {
        return "Automatic{" +
                "typeOfTransmission='" + typeOfTransmission + '\'' +
                ", fourByFour=" + fourByFour +
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
